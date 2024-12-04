package provaquebracabeca;

public abstract class Peca {
    private int id;
    private static int contadorId = 1;
    private Borda[] bordas;
    
    public Peca(){
        bordas = new Borda[4];
    }
    
    public void adicionarBorda(){
        
    }
}
