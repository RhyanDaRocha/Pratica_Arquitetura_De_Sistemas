public class Main { public static void main(String[] args) { 
Pedido pedido1 = new Pedido(150.0, "cartao"); 
pedido1.finalizarPedido();

Pedido pedido2 = new Pedido(200.0, "boleto");
pedido2.finalizarPedido();
}

}