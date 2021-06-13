package generation.grupo03.finalblocoi;

import java.util.Scanner;

public class Despesas {
	
	// Cassimiro: despesas
	//Ícaro: cálculo das porcentagens

	double moradia = 0;
	double agua = 0;
	double luz = 0;
	double entretenimento = 0;
	double mercado = 0; // Troquei "comida" por "mercado" -Icru
	double outros = 0; //Troquei "adicionarMais" por "Outros" - Ana
	double Soma = 0;
	
	double percentualMoradia = 0;
	double percentualAgua = 0;
	double percentualLuz = 0;
	double percentualMercado = 0;
	double percentualEntretenimento = 0;
	double percentualExtra = 0; // Porcentagem da despesa extra (caso tenha).

	
	public double CalcDespesa (double renda) {

		System.out.println();
		System.out.println();
		
		char continua;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Informar o valor da moradia: ");
		moradia = Ler.nextDouble();

		Soma += moradia;

		System.out.println("Informar o valor da agua: ");
		agua = Ler.nextDouble();

		Soma += agua;

		System.out.println("Informar o valor do gasto luz: ");
		luz = Ler.nextDouble();

		Soma += luz;

		System.out.println("Informar o valor do entretenimento: ");
		entretenimento = Ler.nextDouble();

		Soma += entretenimento;

		System.out.println("Informar o valor do comida: ");
		mercado = Ler.nextDouble();

		Soma += mercado;

		System.out.println("Valor total da despesa: " + Soma);

		System.out.println("Deseja informar despesas adicionais? (S/N)");
		continua = Ler.next().toUpperCase().charAt(0);
		if (continua == 'S') {
			System.out.println("Informar despesas adicionais:");
			outros = Ler.nextDouble();

			Soma += outros;

			System.out.println("Valor total da despesa: " + Soma);

		} else if (continua == 'N') {
			System.out.println("Vocï¿½ nï¿½o possui nenhum gasto extra. Continue economizando!");

		}
		

		// Icru

		// Condiï¿½ï¿½o caso o usuï¿½rio tenha despesa extra.

		if (outros > 0) {
			percentualMoradia = (moradia * 100) / renda;

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

		if (outros > 0) {
			percentualExtra = (outros * 100) / renda;

			System.out.println("Da sua renda total, " + percentualMoradia + "% ï¿½ gasto em moradia.");
			System.out.println("Da sua renda total, " + percentualAgua + "% ï¿½ gasto em ï¿½gua.");
			System.out.println("Da sua renda total, " + percentualLuz + "% ï¿½ gasto em luz.");
			System.out.println("Da sua renda total, " + percentualMercado + "% ï¿½ gasto em comida.");
			System.out.println("Da sua renda total, " + percentualEntretenimento + "% ï¿½ gasto em entretenimento.");
			System.out.println("Da sua renda total, " + percentualExtra + "% ï¿½ gasto em outros, ou seja, essa ï¿½ a "
					+ "porcentagem da sua despesa extra.");

		}

		// Condiï¿½ï¿½o caso o usuï¿½rio nï¿½o tenha renda extra.

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

			System.out.println("Da sua renda total, " + percentualMoradia + "% ï¿½ gasto em moradia.");
			System.out.println("Da sua renda total, " + percentualAgua + "% ï¿½ gasto em ï¿½gua.");
			System.out.println("Da sua renda total, " + percentualLuz + "% ï¿½ gasto em luz.");
			System.out.println("Da sua renda total, " + percentualMercado + "% ï¿½ gasto em comida.");
			System.out.println("Da sua renda total, " + percentualEntretenimento + "% ï¿½ gasto em entretenimento.");
		}
		
		return Soma;
	}


	public double getMoradia() {
		return moradia;
	}


	public void setMoradia(double moradia) {
		this.moradia = moradia;
	}


	public double getAgua() {
		return agua;
	}


	public void setAgua(double agua) {
		this.agua = agua;
	}


	public double getLuz() {
		return luz;
	}


	public void setLuz(double luz) {
		this.luz = luz;
	}


	public double getEntretenimento() {
		return entretenimento;
	}


	public void setEntretenimento(double entretenimento) {
		this.entretenimento = entretenimento;
	}


	public double getMercado() {
		return mercado;
	}


	public void setMercado(double mercado) {
		this.mercado = mercado;
	}


	public double getOutros() {
		return outros;
	}


	public void setOutros(double outros) {
		this.outros = outros;
	}


	public double getSoma() {
		return Soma;
	}


	public void setSoma(double soma) {
		Soma = soma;
	}


	public double getPercentualMoradia() {
		return percentualMoradia;
	}


	public void setPercentualMoradia(double percentualMoradia) {
		this.percentualMoradia = percentualMoradia;
	}


	public double getPercentualAgua() {
		return percentualAgua;
	}


	public void setPercentualAgua(double percentualAgua) {
		this.percentualAgua = percentualAgua;
	}


	public double getPercentualLuz() {
		return percentualLuz;
	}


	public void setPercentualLuz(double percentualLuz) {
		this.percentualLuz = percentualLuz;
	}


	public double getPercentualMercado() {
		return percentualMercado;
	}


	public void setPercentualMercado(double percentualMercado) {
		this.percentualMercado = percentualMercado;
	}


	public double getPercentualEntretenimento() {
		return percentualEntretenimento;
	}


	public void setPercentualEntretenimento(double percentualEntretenimento) {
		this.percentualEntretenimento = percentualEntretenimento;
	}


	public double getPercentualExtra() {
		return percentualExtra;
	}


	public void setPercentualExtra(double percentualExtra) {
		this.percentualExtra = percentualExtra;
	}
}
