public class TipoMissaoHistoria implements TipoMissao {

    private static TipoMissaoHistoria tipoMissaoHistoria = new TipoMissaoHistoria();

    private TipoMissaoHistoria () {};

    public static TipoMissaoHistoria getTipoMissaoHistoria() {
        return tipoMissaoHistoria;
    }
}
