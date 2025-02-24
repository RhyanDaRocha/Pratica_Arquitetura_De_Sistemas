public class Main { public static void main(String[] args) { 
Pedido pedido1 = new Pedido(150.0, "cartao"); 
pedido1.finalizarPedido();

Pedido pedido2 = new Pedido(200.0, "boleto");
pedido2.finalizarPedido();

Pedido pedido3 = new Pedido(56.0, "pix");
pedido3.finalizarPedido();
}

}
