public class Cliente {

    public static void main(String[] args) {
        Director director = new Director();

        PedidoBuilder builder = new PedidoBuilder();
        director.construirPedidoUm(builder);

        Pedido pedido = builder.getResult();
        System.out.println("Pedido:\n" + pedido.getnPedido());

        InfoPedidoBuilder infoBuilder = new InfoPedidoBuilder();

        director.construirPedidoUm(infoBuilder);
        InfoPedido infoPedido = infoBuilder.getResult();
        System.out.println("Informações do Pedido:\n" + infoPedido.print());
    }
}
