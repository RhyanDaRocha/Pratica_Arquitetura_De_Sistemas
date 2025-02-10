public class Main {
    public static void main (String args[]){
        Relatorio r1 = new Relatorio("1");
        r1.exibirRelatorio();
        GeradorPdf g1 = new GeradorPdf("1","0");
        g1.gerarPDF();
        calculadorDeEstatistica c1 = new calculadorDeEstatistica("555",100);
        c1.calcularEstatisticas();
    }
}
