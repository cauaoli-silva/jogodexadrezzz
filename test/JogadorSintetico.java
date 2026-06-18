package main; 

public class JogadorSintetico extends Jogador{
    
    public JogadorSintetico(char cor) {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDacasa) {
      
        return true; 
    }
}