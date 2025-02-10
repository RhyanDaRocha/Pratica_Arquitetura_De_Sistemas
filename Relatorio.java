public class Relatorio {
    private String id;
    
    
    public Relatorio(String id) {
        this.id = id;
    }


    public void exibirRelatorio(){
        System.out.println("Exibindo relatorio  " + id);
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }
}