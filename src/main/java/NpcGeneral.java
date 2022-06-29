public class NpcGeneral extends Npc {

    public NpcGeneral (Npc npcSeguinte) {
        listaMissoes.add(TipoMissaoTerritorio.getTipoMissaoTerritorio());
        setNpcSeguinte(npcSeguinte);
    }

    public String getDescricaoResponsabilidade() {
        return "General";
    }
}
