import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MissaoTest {

    NpcRealeza rei;
    NpcGeneral general;
    NpcCacador cacador;
    NpcJornalista jornalista;

    @BeforeEach
    void setUp() {
        rei = new NpcRealeza(null);
        general = new NpcGeneral(rei);
        cacador = new NpcCacador(general);
        jornalista = new NpcJornalista(cacador);
    }

    @Test
    void deveRetornarJornalistaAoAtribuirMissaoSecundaria() {
        assertEquals("Jornalista", jornalista.atribuirNovaMissao(new Missao(TipoMissaoSecundaria.getTipoMissaoSecundaria())));
    }

    @Test
    void deveRetornarCacadorAoAtribuirMissaoDeCaca() {
        assertEquals("Caçador", jornalista.atribuirNovaMissao(new Missao(TipoMissaoCaca.getTipoMissaoCaca())));
    }

    @Test
    void deveRetornarGeneralAoAtribuirMissaoDeTerritorio() {
        assertEquals("General", jornalista.atribuirNovaMissao(new Missao(TipoMissaoTerritorio.getTipoMissaoTerritorio())));
    }

    @Test
    void deveRetornarRealezaAoAtribuirMissaoDaHistoria() {
        assertEquals("Realeza", jornalista.atribuirNovaMissao(new Missao(TipoMissaoHistoria.getTipoMissaoHistoria())));
    }

    @Test
    void deveRetornarMissaoSemAtribuicaoParaDesafios() {
        assertEquals("Missão sem atribuição.", jornalista.atribuirNovaMissao(new Missao(TipoMissaoDesafio.getTipoMissaoDesafio())));
    }
}