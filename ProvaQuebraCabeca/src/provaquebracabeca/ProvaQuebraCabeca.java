package provaquebracabeca;

public class ProvaQuebraCabeca {

    public static void main(String[] args) {
        Borda bd1 = new Borda("vazio, preenchido"); //Borda com 1 preenchedi a esquerda
        Borda bd2 = new Borda("preenchido, vazio"); //Borda com 1 preenchido a direita
        Borda bd3 = new Borda("preenchido"); //Borda totalmente preenchida
        
        Peca pecaCentral = new Peca();
        pecaCentral.adicionarBorda(bd1); //Borda de cima da peca
        pecaCentral.adicionarBorda(bd2); //Borda direita da peca
        pecaCentral.adicionarBorda(bd1); //Borda de baixo da peca
        pecaCentral.adicionarBorda(bd2); //Borda esquerda da peca
        
        
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
