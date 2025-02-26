public class Pedido {
    private final int nPedido;
    private final String desc;
    private final boolean temCarne;
    private final boolean temQueijo;
    private final boolean temLegumes;
    private final boolean temBatataFrita;
    private final String nota;

    public Pedido(int nPedido, String desc, boolean temCarne, boolean temQueijo, boolean temLegumes,
                  boolean temBatataFrita, String nota) {
        this.nPedido = nPedido;
        this.desc = desc;
        this.temCarne = temCarne;
        this.temQueijo = temQueijo;
        this.temLegumes = temLegumes;
        this.temBatataFrita = temBatataFrita;
        this.nota = nota;
    }

    public int getnPedido() {
        return nPedido;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isTemCarne() {
        return temCarne;
    }

    public boolean isTemQueijo() {
        return temQueijo;
    }

    public boolean isTemLegumes() {
        return temLegumes;
    }

    public boolean isTemBatataFrita() {
        return temBatataFrita;
    }


    public String getNota() {
        return nota;
    }

}
