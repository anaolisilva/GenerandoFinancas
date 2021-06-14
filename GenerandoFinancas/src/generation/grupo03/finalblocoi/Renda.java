package generation.grupo03.finalblocoi;

import java.util.Scanner;

public class Renda {
	

	static double rendaTotal = 0;
	
		public double CalcRenda () {
			int tipo;
			int diasPorSemana;
			double salarioDiario;
			double salario = 0;
			double salarioSemanal;
			double salarioMensal;
			char repeticao;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Primeiro, vamos ao c�lculo da sua renda, ou seja, o que voc� ganha todo m�s."
					+ "\nSe voc� n�o recebe mensalmente, n�o se preocupe, a gente te ajuda a calcular de qualquer modo!\n\n"
					+ "\n*Renda di�ria* basicamente significa que voc� recebe por dia de trabalho feito, ou seja, "
					+ "\nao final de cada dia, ganha uma quantia por ter trabalhado."
					+ "\n\n*Renda semanal* significa que voc� recebe depois de trabalhar por uma semana inteira!"
					+ "\n\nJ� a *renda mensal* � como muitos empregados recebem seu sal�rio: um valor fixo recebido "
					+ "\ndepois de um m�s de trabalho.\n\n");
			
			do {
			System.out.println("Digite o n�mero correpondente � sua renda: \n1 - di�ria \n2 - semanal \n3 - mensal");
			tipo = ler.nextInt();
			
			
			
			if (tipo == 1) {
				System.out.println("Quantos dias da semana voc� trabalha, em m�dia?");
				diasPorSemana = ler.nextInt();
				System.out.println("Quanto voc� recebe, mais ou menos (em m�dia), por dia ?");
				salarioDiario = ler.nextDouble();
				
				salario = (salarioDiario * diasPorSemana) * (4.2);
				
			}
			
			else if (tipo == 2) {
				System.out.println("Quanto voc� recebe, em m�dia, por semana?");
				salarioSemanal = ler.nextDouble();
				
				salario = salarioSemanal * (4.2);
			}
				
			else if (tipo == 3) {
				System.out.println("Quanto voc� recebe por m�s?");
				salarioMensal = ler.nextDouble();
				
				salario = salarioMensal;
			}
			
			else {
				System.out.println("ERRO! Voc� n�o inseriu a informa��o corretamente!");
			}
			
			System.out.println("\nVoc� quer adicionar mais uma renda? (S/N)"
					+ "\n--> Pode ser tanto uma renda extra sua (aquela que n�o � do seu trabalho oficial, "
					+ "\n    mas que complementa todo m�s) quanto a renda de mais algu�m do seu n�cleo!");
			repeticao = ler.next().toUpperCase().charAt(0);

			rendaTotal = rendaTotal + salario;
			
		
			} while (repeticao == 'S'); 
			
			System.out.printf("%n%nSua renda total � de R$ %.2f %n%n%n%n%n%n%n%n%n", rendaTotal);
				
			
			return rendaTotal;
		}

		public double getRendaTotal() {
			return rendaTotal;
		}



}
