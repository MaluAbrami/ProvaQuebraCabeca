package provaquebracabeca;

public class Peca {
    private int id;
    private static int contadorId = 1;
    private Borda[] bordas;
    
    public Peca(){
        bordas = new Borda[4];
    }
    
    public void adicionarBorda(Borda borda){
        for(int i = 0; i < 4; i++){
            if(i < 4)
                bordas[i] = borda;
            else
               System.out.println("Essa peca ja possui todas as bordas");
        }
    }
}
