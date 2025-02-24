public class Pedido { 
    private double valor; 
    private Pagamento pagamento;

    public Pedido(double valor, String tipoPagamento) {
        this.valor = valor;
        this.pagamento = criarPagamento(tipoPagamento);
    }
    
    private Pagamento criarPagamento(String tipo) {
        if ("cartao".equalsIgnoreCase(tipo)) {
            return new PagamentoCartao();
        } else if ("boleto".equalsIgnoreCase(tipo)) {
            return new PagamentoBoleto();
        }
        return null;
    }
    
    public void finalizarPedido() {
        if (pagamento != null) {
            pagamento.processarPagamento(valor);
        } else {
            System.out.println("Método de pagamento inválido.");
        }
    }}