public class NpcRealeza  extends Npc {

    public NpcRealeza (Npc npcSeguinte) {
        listaMissoes.add(TipoMissaoHistoria.getTipoMissaoHistoria());
        setNpcSeguinte(npcSeguinte);
    }

    public String getDescricaoResponsabilidade() {
        return "Realeza";
    }
}
