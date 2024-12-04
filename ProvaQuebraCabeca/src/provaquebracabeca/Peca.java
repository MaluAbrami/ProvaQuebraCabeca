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
    
    public boolean verificarEncaixe(Borda bd1, Borda bd2){
        if(bd1.equals(bd2)){
            System.out.println("Impossivel realizar o encaixe de bordas iguais");
            return false;
        }
        else if(bd1.getDentes() == "preenchido" || bd2.getDentes() == "preenchido"){
            System.out.println("Impossivel realizar o encaixe de bordas totalmente preenchidas");
            return false;
        }
        else{ //aqui ambas sao diferentes entao encaixam
            System.out.println("Encaixe possivel");
            return true;
        }
    }
}
