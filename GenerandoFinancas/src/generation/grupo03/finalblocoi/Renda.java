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
			
			System.out.println("Primeiro, vamos ao cálculo da sua renda, ou seja, o que você ganha todo mês."
					+ "\nSe você não recebe mensalmente, não se preocupe, a gente te ajuda a calcular de qualquer modo!\n\n"
					+ "\n*Renda diária* basicamente significa que você recebe por dia de trabalho feito, ou seja, "
					+ "\nao final de cada dia, ganha uma quantia por ter trabalhado."
					+ "\n\n*Renda semanal* significa que você recebe depois de trabalhar por uma semana inteira!"
					+ "\n\nJá a *renda mensal* é como muitos empregados recebem seu salário: um valor fixo recebido "
					+ "\ndepois de um mês de trabalho.\n\n");
			
			do {
			System.out.println("Digite o número correpondente à sua renda: \n1 - diária \n2 - semanal \n3 - mensal");
			tipo = ler.nextInt();
			
			
			
			if (tipo == 1) {
				System.out.println("Quantos dias da semana você trabalha, em média?");
				diasPorSemana = ler.nextInt();
				System.out.println("Quanto você recebe, mais ou menos (em média), por dia ?");
				salarioDiario = ler.nextDouble();
				
				salario = (salarioDiario * diasPorSemana) * (4.2);
				
			}
			
			else if (tipo == 2) {
				System.out.println("Quanto você recebe, em média, por semana?");
				salarioSemanal = ler.nextDouble();
				
				salario = salarioSemanal * (4.2);
			}
				
			else if (tipo == 3) {
				System.out.println("Quanto você recebe por mês?");
				salarioMensal = ler.nextDouble();
				
				salario = salarioMensal;
			}
			
			else {
				System.out.println("ERRO! Você não inseriu a informação corretamente!");
			}
			
			System.out.println("\nVocê quer adicionar mais uma renda? (S/N)"
					+ "\n--> Pode ser tanto uma renda extra sua (aquela que não é do seu trabalho oficial, "
					+ "\n    mas que complementa todo mês) quanto a renda de mais alguém do seu núcleo!");
			repeticao = ler.next().toUpperCase().charAt(0);

			rendaTotal = rendaTotal + salario;
			
		
			} while (repeticao == 'S'); 
			
			System.out.printf("%n%nSua renda total é de R$ %.2f %n%n%n%n%n%n%n%n%n", rendaTotal);
				
			
			return rendaTotal;
		}

		public double getRendaTotal() {
			return rendaTotal;
		}



}
