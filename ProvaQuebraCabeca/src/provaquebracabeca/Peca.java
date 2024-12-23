package provaquebracabeca;

public class Peca {
    private int id;
    private static int contadorId = 1;
    private int contador = 0;
    private Borda[] bordas;
    
    public Peca(){
        this.id = contadorId++;
        bordas = new Borda[4];
    }
    
    public int getId(){
        return id;
    }
    
    public Borda[] getBorda(){
        return bordas;
    }
    
    public void adicionarBorda(Borda borda){
        //indice 0 - borda de cima
        //indice 1 - borda direita
        //indice 2 - borda de baixo
        //indice 3 - borda esquerda
        if(contador < 4){
                bordas[contador] = borda;
                contador++;
        }
        else{
            System.out.println("Essa peca ja possui todas as bordas");
        }
    }
    
    public boolean verificarEncaixe(Borda bd1, Borda bd2){
        if(bd1.equals(bd2)){
            return false;
        }
        else if(bd1.getDentes().equals("preenchido") || bd2.getDentes().equals("preenchido")){
            return false;
        }
        else{ //aqui ambas sao diferentes entao encaixam
            return true;
        }
    }
}
