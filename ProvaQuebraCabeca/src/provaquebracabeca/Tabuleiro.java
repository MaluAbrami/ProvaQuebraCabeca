package provaquebracabeca;

public class Tabuleiro {
    private Peca[][] pecas;
    private int contador = 0;
    
    public Tabuleiro(){
        this.pecas = new Peca[3][3];
    }
    
    public Peca getPeca(int x, int y){
        if(x < 3 && y < 3 && x >= 0 && y >= 0){
            return pecas[x][y];
        }
        return null;
    }
    
    public void adicionarPeca(Peca peca, int x, int y) {
        if (x >= 0 && y >= 0 && x < 3 && y < 3) {
            if (pecas[x][y] == null) {
                pecas[x][y] = peca;
                contador++;
            } else {
                System.out.println("Posição já ocupada!");
            }
        } else {
            System.out.println("Coordenadas fora do tabuleiro!");
        }
    }
    
    public void encaixarPecaNoTabuleiro(Peca peca, int x, int y) {
        if (pecas[x][y] != null) {
            System.out.println("Posição já ocupada!");
            return;
        }

        boolean encaixa = true;

        // Verificar encaixes com peças adjacentes
        Peca pecaCima = getPeca(x - 1, y);
        if (pecaCima != null) {
            encaixa &= peca.verificarEncaixe(peca.getBorda()[0], pecaCima.getBorda()[2]); // topo com baixo
        }

        Peca pecaDireita = getPeca(x, y + 1);
        if (pecaDireita != null) {
            encaixa &= peca.verificarEncaixe(peca.getBorda()[1], pecaDireita.getBorda()[3]); // direita com esquerda
        }

        Peca pecaBaixo = getPeca(x + 1, y);
        if (pecaBaixo != null) {
            encaixa &= peca.verificarEncaixe(peca.getBorda()[2], pecaBaixo.getBorda()[0]); // baixo com topo
        }

        Peca pecaEsquerda = getPeca(x, y - 1);
        if (pecaEsquerda != null) {
            encaixa &= peca.verificarEncaixe(peca.getBorda()[3], pecaEsquerda.getBorda()[1]); // esquerda com direita
        }

        if (encaixa) {
            adicionarPeca(peca, x, y);
            System.out.println("Peça encaixada com sucesso!");
        } else {
            System.out.println("A peça não encaixa corretamente nessa posição.");
        }
    }
}
