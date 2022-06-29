public class TipoMissaoDesafio implements TipoMissao {

    private static TipoMissaoDesafio tipoMissaoDesafio = new TipoMissaoDesafio();

    private TipoMissaoDesafio () {};

    public static TipoMissaoDesafio getTipoMissaoDesafio() {
        return tipoMissaoDesafio;
    }
}
