public class Director {

    public void construirPedidoUm(Builder builder){
        builder.setnPedido(1);
        builder.setDesc("Pedido número um, simples e prático, só carne.");
        builder.setTemCarne(true);
        builder.setTemLegumes(false);
        builder.setTemQueijo(false);
        builder.setTemBatataFrita(true);
        builder.setNota("Acompanha batata-frita.");
    }

    public void construirPedidoDois(Builder builder){
        builder.setnPedido(2);
        builder.setDesc("Pedido número dois, especial da casa, cheeseburguer!.");
        builder.setTemCarne(true);
        builder.setTemLegumes(false);
        builder.setTemQueijo(true);
        builder.setTemBatataFrita(true);
        builder.setNota("Não vem acompanhado.");
    }

    public void construirPedidoTrês(Builder builder){
        builder.setnPedido(3);
        builder.setDesc("Pedido número três, para aquela fome de matar.");
        builder.setTemCarne(true);
        builder.setTemLegumes(true);
        builder.setTemQueijo(true);
        builder.setTemBatataFrita(true);
        builder.setNota("Acompanha batata-frita.");
    }
}
