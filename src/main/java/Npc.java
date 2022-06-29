import java.util.ArrayList;

public abstract class Npc {

    protected ArrayList listaMissoes = new ArrayList();
    private Npc npcSeguinte;

    public Npc getNpcSeguinte() {
        return this.npcSeguinte;
    }

    public void setNpcSeguinte (Npc npcSeguinte) {
        this.npcSeguinte = npcSeguinte;
    }

    public abstract String getDescricaoResponsabilidade();

    public String atribuirNovaMissao (Missao missao) {
        if (listaMissoes.contains(missao.getTipoMissao())){
            return getDescricaoResponsabilidade();
        }
        else {
            if (npcSeguinte != null) {
                return npcSeguinte.atribuirNovaMissao(missao);
            }
            else {
                return "Missão sem atribuição.";
            }
        }
    }
}
