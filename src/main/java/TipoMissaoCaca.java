public class TipoMissaoCaca implements TipoMissao {

    private static TipoMissaoCaca tipoMissaoCaca = new TipoMissaoCaca();

    private TipoMissaoCaca () {};

    public static TipoMissaoCaca getTipoMissaoCaca() {
        return tipoMissaoCaca;
    }
}

