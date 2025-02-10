public class GeradorPdf extends Relatorio{
   private String arquivo;

   
    public GeradorPdf(String id, String arquivo) {
    super(id);
    this.arquivo = arquivo;
}


    public void gerarPDF() {
        System.out.println("Gerando relatório em PDF...");
        }


    public String getArquivo() {
        return arquivo;
    }


    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
