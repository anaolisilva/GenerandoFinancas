package generation.grupo03.finalblocoi;

import java.util.Scanner;

public class Renda {
	
	int tipo;
	int diasPorSemana;
	double salarioDiario;
	double salario = 0;
	double salarioSemanal;
	double salarioMensal;
	int repeticao;
	double rendaTotal = 0;
	
		public double CalcRenda () {
			

			
			Scanner ler = new Scanner(System.in);
			
			do {
			System.out.println("Digite o numero correpondente � sua renda: \n1- di�ria \n2- semanal \n3- mensal");
			tipo = ler.nextInt();
			
			
			
			if (tipo == 1) {
				System.out.println("Quantos dias da semana voce trabalha em m�dia ?");
				diasPorSemana = ler.nextInt();
				System.out.println("Quanto voc� recebe, em m�dia, por dia ?");
				salarioDiario = ler.nextDouble();
				
				salario = (salarioDiario * diasPorSemana) * (4.2);
				
			}
			
			else if (tipo == 2) {
				System.out.println("Quanto que voce recebe, em media, por semana ?");
				salarioSemanal = ler.nextDouble();
				
				salario = salarioSemanal * (4.2);
			}
				
			else if (tipo == 3) {
				System.out.println("Quanto voc� recebe por m�s ? ");
				salarioMensal = ler.nextDouble();
				
				salario = salarioMensal;
			}
			
			else {
				System.out.println("ERRO! Voc� n�o inseriu a informa��o corretamente!");
			}
			
			System.out.println("Digite 1 para adicionar outra renda ou 0 para encerrar o calculo da renda");
			repeticao = ler.nextInt();

			rendaTotal = rendaTotal + salario;
			
		
			} while (repeticao != 0); 
				
			
			return rendaTotal;
		}

		public double getRendaTotal() {
			return rendaTotal;
		}

		public void setRendaTotal(double rendaTotal) {
			this.rendaTotal = rendaTotal;
		}


}
