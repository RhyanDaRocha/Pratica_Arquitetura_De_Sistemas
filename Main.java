public class Main {
    public static void main(String args[]) {
        Relatorio relatorio = new Relatorio("1");
        relatorio.exibirRelatorio();

        GeradorPdf geradorPdf = new GeradorPdf("relatorio.pdf");
        geradorPdf.gerar(relatorio);

        CalculadoraEstatisticas calculadora = new CalculadoraEstatisticas();
        calculadora.calcular(relatorio);
    }
}