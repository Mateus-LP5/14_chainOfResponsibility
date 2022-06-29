public class NpcCacador extends Npc {

    public NpcCacador (Npc npcSeguinte) {
        listaMissoes.add(TipoMissaoCaca.getTipoMissaoCaca());
        setNpcSeguinte(npcSeguinte);
    }

    public String getDescricaoResponsabilidade() {
        return "Caçador";
    }
}
