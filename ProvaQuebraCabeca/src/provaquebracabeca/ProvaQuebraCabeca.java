package provaquebracabeca;

import java.util.Scanner;

public class ProvaQuebraCabeca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        
        Borda bd1 = new Borda("vazio, preenchido"); //Borda com 1 preenchedi a esquerda
        Borda bd2 = new Borda("preenchido, vazio"); //Borda com 1 preenchido a direita
        Borda bd3 = new Borda("preenchido"); //Borda totalmente preenchido
        
        //PECA CENTRAL
        //1
        Peca pecaCentral = new Peca();
        pecaCentral.adicionarBorda(bd1); //Borda de cima da peca - se liga a central superior
        pecaCentral.adicionarBorda(bd1); //Borda direita da peca - se liga a central direita
        pecaCentral.adicionarBorda(bd1); //Borda de baixo da peca - se liga a central inferior
        pecaCentral.adicionarBorda(bd1); //Borda esquerda da peca - se liga a central esquerda
        
        //PECAS CENTRAIS DOS CANTOS/PECAS QUE SE LIGAM A CENTRAL
        //2
        Peca pecaDaBordaCentralSuperior = new Peca();
        pecaDaBordaCentralSuperior.adicionarBorda(bd3); //Borda do canto
        pecaDaBordaCentralSuperior.adicionarBorda(bd1); //Borda que se liga a de borda do lado direito
        pecaDaBordaCentralSuperior.adicionarBorda(bd2); //Borda que se liga a peca central
        pecaDaBordaCentralSuperior.adicionarBorda(bd1); //Borda que e liga a de borda do lado esquerdo
        
        //3
        Peca pecaDaBordaCentralDireita = new Peca();
        pecaDaBordaCentralDireita.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralDireita.adicionarBorda(bd3); //Borda do canto
        pecaDaBordaCentralDireita.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralDireita.adicionarBorda(bd2); //Borda que se liga a peca central
        
        //4
        Peca pecaDaBordaCentralInferior = new Peca();
        pecaDaBordaCentralInferior.adicionarBorda(bd2); //Borda que se liga a peca central
        pecaDaBordaCentralInferior.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralInferior.adicionarBorda(bd3); //Borda do canto
        pecaDaBordaCentralInferior.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        
        //5
        Peca pecaDaBordaCentralEsquerda = new Peca();
        pecaDaBordaCentralEsquerda.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralEsquerda.adicionarBorda(bd2); //Borda que se liga a peca central
        pecaDaBordaCentralEsquerda.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralEsquerda.adicionarBorda(bd3); //Borda do canto
        
        //PECAS DOS CANTOS
        //6
        Peca pecaDaBordaSuperiorD = new Peca();
        pecaDaBordaSuperiorD.adicionarBorda(bd3);
        pecaDaBordaSuperiorD.adicionarBorda(bd3);
        pecaDaBordaSuperiorD.adicionarBorda(bd2);
        pecaDaBordaSuperiorD.adicionarBorda(bd2);
        
        //7
        Peca pecaDaBordaSuperiorE = new Peca();
        pecaDaBordaSuperiorE.adicionarBorda(bd3);
        pecaDaBordaSuperiorE.adicionarBorda(bd2);
        pecaDaBordaSuperiorE.adicionarBorda(bd2);
        pecaDaBordaSuperiorE.adicionarBorda(bd3);
        
        //8
        Peca pecaDaBordaInferiorD = new Peca();
        pecaDaBordaInferiorD.adicionarBorda(bd2);
        pecaDaBordaInferiorD.adicionarBorda(bd3);
        pecaDaBordaInferiorD.adicionarBorda(bd3);
        pecaDaBordaInferiorD.adicionarBorda(bd2);
        
        //9
        Peca pecaDaBordaInferiorE = new Peca();
        pecaDaBordaInferiorE.adicionarBorda(bd2);
        pecaDaBordaInferiorE.adicionarBorda(bd2);
        pecaDaBordaInferiorE.adicionarBorda(bd3);
        pecaDaBordaInferiorE.adicionarBorda(bd3);
        
        //ADICIONANDO PECAS AO TABULEIRO
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaSuperiorE, 0, 0);
        scanner.nextLine();
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaSuperiorD, 0, 2); 
        scanner.nextLine();
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaInferiorD, 2, 2);
        scanner.nextLine();
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaInferiorE, 2, 0);
        scanner.nextLine();
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaCentralSuperior, 0, 1);
        scanner.nextLine();
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaCentralInferior, 2, 1); 
        scanner.nextLine();
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaCentralDireita, 1, 2);
        scanner.nextLine();
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaDaBordaCentralEsquerda, 1, 0);
        scanner.nextLine();
        
        
        tabuleiro.encaixarPecaNoTabuleiro(pecaCentral, 1, 1);
        
        tabuleiro.imprimirTabuleiro();
    }
    
}
