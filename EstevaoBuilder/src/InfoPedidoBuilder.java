public class InfoPedidoBuilder implements Builder {
    private int nPedido;
    private String desc;
    private boolean temCarne;
    private boolean temQueijo;
    private boolean temLegumes;
    private boolean temBatataFrita;
    private String nota;

    @Override
    public void setnPedido(int nPedido) {
        this.nPedido = nPedido;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public void setTemCarne(boolean temCarne) {
        this.temCarne = temCarne;
    }

    @Override
    public void setTemQueijo(boolean temQueijo) {
        this.temQueijo = temQueijo;
    }

    @Override
    public void setTemLegumes(boolean temLegumes) {
        this.temLegumes = temLegumes;
    }

    @Override
    public void setTemBatataFrita(boolean temBatataFrita) {
        this.temBatataFrita = temBatataFrita;
    }

    @Override
    public void setNota(String nota) {
        this.nota = nota;
    }

    public InfoPedido getResult() {
        return new InfoPedido(nPedido, desc, temCarne, temQueijo, temLegumes, temBatataFrita, nota);
    }
}
