
package generation.grupo03.finalblocoi;

import java.util.Scanner;

public class Despesas {
	
	//Cassimiro

	public static void main(String[] args) {
		
		int moradia =0; 
		int agua =0; 
		int luz =0; 
		int entreterimento =0; 
		int comida =0;
		int adicionarMais =0; 
		int Soma = 0;
		int SomaTotal = 0; 
		char continua;
		
		System.out.println("Informar o valor da moradia: ");

        Scanner Ler = new Scanner(System.in);
       
        moradia = Ler .nextInt(); 
		
        Soma = Soma + moradia;
        		
        System.out.println("Informar o valor da agua: ");		
        agua = Ler .nextInt();
        
        Soma = Soma + agua; 
        		
        System.out.println("Informar o valor do gasto luz: ");		
        luz = Ler .nextInt();	
        
        Soma = Soma + luz;  
        
        System.out.println("Informar o valor do entreterimento: ");		
        entreterimento = Ler .nextInt();
        
        Soma = Soma + entreterimento; 
        
        System.out.println("Informar o valor do comida: ");		
        comida = Ler .nextInt();
        
        Soma = Soma + comida; 
        
        Soma = SomaTotal ;
        
        
        System.out.println("Deseja informar despesas adicionais? (S/N)");		
        continua = Ler .next().toUpperCase().charAt(0);
        if(continua == 'S') {
        System.out.println("Informar despesas adicionais:");
        adicionarMais = Ler .nextInt();
        
        adicionarMais = Soma + adicionarMais; 
          
         
        System.out.println("Valor total da despesa: " + SomaTotal);
         adicionarMais = SomaTotal ;
         
         SomaTotal = adicionarMais + SomaTotal; 
        }
        
        else if(continua == 'N') { 
        	System.out.println("Valor total da despesa: " + SomaTotal);
        	
        }
       
        
        
	}

}