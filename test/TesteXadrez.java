package test;

import main.Peca;

import main.Tabuleiro; 

import main.Bispo; 

import main.Cavalo;

import main.Peao;

import main.Rainha; 

import main.Rei; 

import main.Torre; 
public class TesteXadrez {
    
    public static void main(String[] args){ 
        Peca peca = new Peca(); 
        
        Tabuleiro tabuleiro = new Tabuleiro(); 

        Bispo bispo = new Bispo();
        
        Cavalo cavalo = new Cavalo();

        Peao peao = new Peao(); 
       
        Rainha rainha = new Rainha(); 
        
        Rei rei = new Rei();

        Torre torre = new Torre();

         System.out.println("Todos os objetos fora criados com sucesso.");         
 
    }
}
