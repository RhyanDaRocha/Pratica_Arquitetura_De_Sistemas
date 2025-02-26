public class InfoPedido {
    private final int nPedido;
    private final String desc;
    private final boolean temCarne;
    private final boolean temQueijo;
    private final boolean temLegumes;
    private final boolean temBatataFrita;
    private final String nota;

    public InfoPedido(int nPedido, String desc, boolean temCarne, boolean temQueijo, boolean temLegumes,
                      boolean temBatataFrita, String nota) {
        this.nPedido = nPedido;
        this.desc = desc;
        this.temCarne = temCarne;
        this.temQueijo = temQueijo;
        this.temLegumes = temLegumes;
        this.temBatataFrita = temBatataFrita;
        this.nota = nota;
    }

    public String print() {
        String info = "";
        info += "Número do Pedido: " + nPedido + "\n";
        info += "Descrição do Pedido: " + desc + "\n";
        info += "Tem carne? " + temCarne + "\n";
        info += "Tem queijo? " + temQueijo + "\n";
        info += "Tem legumes? " + temLegumes + "\n";
        info += "Tem batata-frita? " + temBatataFrita + "\n";
        info += "Nota do Pedido: " + nota + "\n";
        return info;
    }
}
