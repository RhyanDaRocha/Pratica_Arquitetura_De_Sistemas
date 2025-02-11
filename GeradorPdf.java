public class GeradorPdf  {
    private String arquivo;

    public GeradorPdf(String arquivo) {
        this.arquivo = arquivo;
    }

  
    public void gerar(Relatorio relatorio) {
        System.out.println("Gerando relatório " + relatorio.getId() + " em PDF: " + arquivo);
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}