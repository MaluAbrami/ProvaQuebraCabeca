package provaquebracabeca;

public class Tabuleiro {
    private Peca[][] pecas;
    private int contador = 0;
    
    public Tabuleiro(){
        this.pecas = new Peca[3][3];
    }
    
    public void adicionarPeca(Peca peca){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i; j++){
                if(contador < 9){
                    pecas[i][j] = peca;
                    contador++;
                }
                else{
                    System.out.println("Tabuleiro cheio");
                }
            }
        }
    }
    
    public void encaixarPecaNoTabuleiro(Peca peca, int x, int y){
        if(pecas == null){ //primeira peca
            adicionarPeca(peca);
        }
        else{
            if()
        }
    }
}
