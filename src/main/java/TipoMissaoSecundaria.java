public class TipoMissaoSecundaria implements TipoMissao {

    private static TipoMissaoSecundaria tipoMissaoSecundaria = new TipoMissaoSecundaria();

    private TipoMissaoSecundaria() {};

    public static TipoMissaoSecundaria getTipoMissaoSecundaria() {
        return tipoMissaoSecundaria;
    }
}

