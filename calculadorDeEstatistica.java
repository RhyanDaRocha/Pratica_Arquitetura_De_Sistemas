public class calculadorDeEstatistica extends Relatorio{
    private int numero;
    
public calculadorDeEstatistica(String id, int numero) {
        super(id);
        this.numero = numero;
    }
    

public void calcularEstatisticas() {
    System.out.println("Calculando estatísticas...");
    }


public int getNumero() {
    return numero;
}


public void setNumero(int numero) {
    this.numero = numero;
}
}