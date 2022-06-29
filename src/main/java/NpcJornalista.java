public class NpcJornalista extends Npc {

    public NpcJornalista(Npc npcSeguinte) {
        listaMissoes.add(TipoMissaoSecundaria.getTipoMissaoSecundaria());
        setNpcSeguinte(npcSeguinte);
    }

    public String getDescricaoResponsabilidade() {
        return "Jornalista";
    }
}
