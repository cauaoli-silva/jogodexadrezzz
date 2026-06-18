
package main; 

public abstract class Jogador implements JogadorInterface{
   
    
        private char cor;
        
    public Jogador(char cor) {
       if (cor == 'b' || cor == 'p') {
            this.cor = cor;
        } else {
           System.out.println("cor invalida fi, usa b para branco e p para preto");
        }
    }
}