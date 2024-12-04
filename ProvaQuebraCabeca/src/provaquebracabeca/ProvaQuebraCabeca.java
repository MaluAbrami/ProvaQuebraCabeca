package provaquebracabeca;

public class ProvaQuebraCabeca {

    public static void main(String[] args) {
        Borda bd1 = new Borda("vazio, preenchido"); //Borda com 1 preenchedi a esquerda
        Borda bd2 = new Borda("preenchido, vazio"); //Borda com 1 preenchido a direita
        Borda bd3 = new Borda("preenchido"); //Borda totalmente preenchida
        
        Peca pecaCentral = new Peca();
        pecaCentral.adicionarBorda(bd1);
        pecaCentral.adicionarBorda(bd2);
        pecaCentral.adicionarBorda(bd1);
        pecaCentral.adicionarBorda(bd2);
    }
    
}
