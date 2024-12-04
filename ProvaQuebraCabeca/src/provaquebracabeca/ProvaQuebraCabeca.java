package provaquebracabeca;

public class ProvaQuebraCabeca {

    public static void main(String[] args) {
        Borda bd1 = new Borda("vazio, preenchido"); //Borda com 1 preenchedi a esquerda
        Borda bd2 = new Borda("preenchido, vazio"); //Borda com 1 preenchido a direita
        Borda bd3 = new Borda("preenchido"); //Borda totalmente preenchida
        
        //PECA CENTRAL
        Peca pecaCentral = new Peca();
        pecaCentral.adicionarBorda(bd1); //Borda de cima da peca - se liga a central superior
        pecaCentral.adicionarBorda(bd2); //Borda direita da peca - se liga a central direita
        pecaCentral.adicionarBorda(bd1); //Borda de baixo da peca - se liga a central inferior
        pecaCentral.adicionarBorda(bd2); //Borda esquerda da peca - se liga a central esquerda
        
        //PECAS CENTRAIS DOS CANTOS/PECAS QUE SE LIGAM A CENTRAL
        Peca pecaDaBordaCentralSuperior = new Peca();
        pecaDaBordaCentralSuperior.adicionarBorda(bd3); //Borda do canto
        pecaDaBordaCentralSuperior.adicionarBorda(bd1); //Borda que se liga a de borda do lado direito
        pecaDaBordaCentralSuperior.adicionarBorda(bd2); //Borda que se liga a peca central
        pecaDaBordaCentralSuperior.adicionarBorda(bd1); //Borda que e liga a de borda do lado esquerdo
        
        Peca pecaDaBordaCentralDireita = new Peca();
        pecaDaBordaCentralDireita.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralDireita.adicionarBorda(bd3); //Borda do canto
        pecaDaBordaCentralDireita.adicionarBorda(bd1); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralDireita.adicionarBorda(bd1); //Borda que se liga a peca central
        
        Peca pecaDaBordaCentralInferior = new Peca();
        pecaDaBordaCentralInferior.adicionarBorda(bd2); //Borda que se liga a peca central
        pecaDaBordaCentralInferior.adicionarBorda(bd2); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralInferior.adicionarBorda(bd3); //Borda do canto
        pecaDaBordaCentralInferior.adicionarBorda(bd2); //Borda que se liga a outra peca de borda
        
        Peca pecaDaBordaCentralEsquerda = new Peca();
        pecaDaBordaCentralEsquerda.adicionarBorda(bd2); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralEsquerda.adicionarBorda(bd1); //Borda que se liga a peca central
        pecaDaBordaCentralEsquerda.adicionarBorda(bd2); //Borda que se liga a outra peca de borda
        pecaDaBordaCentralEsquerda.adicionarBorda(bd3); //Borda do canto
        
        //PECAS DOS CANTOS
        Peca pecaDaBordaSuperiorD = new Peca();
        pecaDaBordaSuperiorD.adicionarBorda(bd3);
        pecaDaBordaSuperiorD.adicionarBorda(bd3);
        pecaDaBordaSuperiorD.adicionarBorda(bd2);
        pecaDaBordaSuperiorD.adicionarBorda(bd2);
        
        Peca pecaDaBordaSuperiorE = new Peca();
        pecaDaBordaSuperiorE.adicionarBorda(bd3);
        pecaDaBordaSuperiorE.adicionarBorda(bd2);
        pecaDaBordaSuperiorE.adicionarBorda(bd2);
        pecaDaBordaSuperiorE.adicionarBorda(bd3);
        
        Peca pecaDaBordaInferiorD = new Peca();
        pecaDaBordaInferiorD.adicionarBorda(bd2);
        pecaDaBordaInferiorD.adicionarBorda(bd3);
        pecaDaBordaInferiorD.adicionarBorda(bd3);
        pecaDaBordaInferiorD.adicionarBorda(bd2);
        
        Peca pecaDaBordaInferiorE = new Peca();
        pecaDaBordaInferiorE.adicionarBorda(bd2);
        pecaDaBordaInferiorE.adicionarBorda(bd2);
        pecaDaBordaInferiorE.adicionarBorda(bd3);
        pecaDaBordaInferiorE.adicionarBorda(bd3);
    }
    
}
