package generation.grupo03.finalblocoi;

import java.util.Scanner;

public class Despesas {
	
	 //Cassimiro: despesas
	//Ícaro: cálculo das porcentagens

	static double moradia = 0;
	static double agua = 0;
	static double luz = 0;
	static double entretenimento = 0;
	static double mercado = 0; // Troquei "comida" por "mercado" -Icru
	static double outros = 0; //Troquei "adicionarMais" por "Outros" - Ana
	static double totalOutros = 0;
	static double Soma = 0;
	
	static double percentualMoradia = 0;
	static double percentualAgua = 0;
	static double percentualLuz = 0;
	static double percentualMercado = 0;
	static double percentualEntretenimento = 0;
	static double percentualExtra = 0; // Porcentagem da despesa extra (caso tenha).

	
	public double CalcDespesa (double renda) {

		System.out.println();
		System.out.println();
		System.out.println("Agora vamos ao cálculo das despesas!\nDigite o valor das suas despesas conforme as categorias indicadas."
				+ "\nFica tranquilo que a gente vai adicionar uma categoria de cada vez!\n\n"
				+ "Se você está calculando as despesas sozinhe, mas mora com outras pessoas, não esqueça de adicionar "
				+ "\napenas sua parte das despesas, ou seja, digite o valor que você é responsável por pagar!"); //Essa última parte tá meio confusa mas eu sei como melhorar? não - Ana
		
		char continua;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("\n\n\nQuanto você paga em moradia (aluguel, parcela, condomínio...)?");
		moradia = Ler.nextDouble();

		Soma += moradia;

		System.out.println("\nQuanto você paga na sua conta de água, mais ou menos? ");
		agua = Ler.nextDouble();

		Soma += agua;

		System.out.println("\nQuanto você paga na sua conta de luz, mais ou menos?");
		luz = Ler.nextDouble();

		Soma += luz;

		System.out.println("\nQuanto você paga de entretenimento por mês, mais ou menos?\n(um cineminha de vez em quando, assinaturas de streaming, jogos...)");
		entretenimento = Ler.nextDouble();

		Soma += entretenimento;

		System.out.println("\nQuanto você gasta de mercado, por mês, mais ou menos?");
		mercado = Ler.nextDouble();

		Soma += mercado;

		System.out.println("\nDeseja informar despesas adicionais? (S/N)");
		continua = Ler.next().toUpperCase().charAt(0);
		
		if (continua == 'S') {
			System.out.println("\n\nPode digitar uma despesa adicional de cada vez, a gente calcula o total pra você!\n"
					+ "Quando você tiver acabado de digitar essas outras despesas, digite 0.\n\n");
			outros = 1;
		} else {
			System.out.println("\n\nVocê não possui nenhum gasto extra. Continue economizando!");

		}
		
		while (outros != 0) {
			System.out.println("Informe suas despesas adicionais:");
			outros = Ler.nextDouble();
			
			totalOutros += outros;
			Soma += outros;
		} //Coloquei um whilezinho aqui pra gente fazer aquele rolê da pessoa não ter que calcular coisa sozinha! -Ana
		
		System.out.println("\n\nEsse é o valor total das suas despesas: R$ " + Soma + "\n\n");
		
		// Icru
		// Condição caso o usuário tenha despesa extra.

		if (outros > 0) {
			percentualMoradia = moradia * 100 / renda;

		}

		if (outros > 0) {
			percentualAgua = (agua * 100) / renda;

		}

		if (outros > 0) {
			percentualLuz = (luz * 100) / renda;

		}

		if (outros > 0) {
			percentualMercado = (mercado * 100) / renda;

		}

		if (outros > 0) {
			percentualEntretenimento = (entretenimento * 100) / renda;

		}

		if (totalOutros > 0) {
			percentualExtra = (totalOutros * 100) / renda;
		}

		// Condição caso o usuïário não tenha renda extra.

		else if (outros <= 0) {
			percentualMoradia = (moradia * 100) / renda;

		}

		if (outros <= 0) {
			percentualAgua = (agua * 100) / renda;

		}

		if (outros <= 0) {
			percentualLuz = (luz * 100) / renda;

		}

		if (outros <= 0) {
			percentualMercado = (mercado * 100) / renda;

		}

		if (outros <= 0) {
			percentualEntretenimento = (entretenimento * 100) / renda;		
		
		}
		return Soma;

	}


	public double getMoradia() {
		return moradia;
	}


	public double getAgua() {
		return agua;
	}


	public double getTotalOutros() {
		return totalOutros;
	}


	public void setTotalOutros(double totalOutros) {
		Despesas.totalOutros = totalOutros;
	}


	public double getLuz() {
		return luz;
	}



	public double getEntretenimento() {
		return entretenimento;
	}



	public double getMercado() {
		return mercado;
	}


	public double getOutros() {
		return outros;
	}


	public double getSoma() {
		return Soma;
	}



	public double getPercentualMoradia(double renda) {
		return moradia * 100 / renda;
	}


	public double getPercentualAgua() {
		return percentualAgua;
	}


	public double getPercentualLuz() {
		return percentualLuz;
	}


	public double getPercentualMercado() {
		return percentualMercado;
	}


	public double getPercentualEntretenimento() {
		return percentualEntretenimento;
	}


	public double getPercentualExtra() {
		return percentualExtra;
	}

}
