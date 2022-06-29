public class TipoMissaoTerritorio implements TipoMissao {

    private static TipoMissaoTerritorio tipoMissaoTerritorio = new TipoMissaoTerritorio();

    private TipoMissaoTerritorio () {};

    public static TipoMissaoTerritorio getTipoMissaoTerritorio() {
        return tipoMissaoTerritorio;
    }
}