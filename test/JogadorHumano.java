package main; 

public class  JogadorHumano extends Jogador{
    
    public JogadorHumano(char cor) {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDacasa) {
      
        return true; 
    }
}