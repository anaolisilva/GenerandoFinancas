package porcentagens;

import java.util.Scanner;

public class C�lculoPorcentagem {

	public static void main(String[] args) {

		int moradia = 0;
		int agua = 0;
		int luz = 0;
		int entretenimento = 0;
		int mercado = 0; // Troquei "comida" por "mercado" -Icru
		int adicionarMais = 0;
		int Soma = 0;
		char continua;
		int renda = 900; // Coloquei essa vari�vel s� pra testar antes da parte da renda ficar pronta.
		double percentualMoradia = 0;
		double percentualAgua = 0;
		double percentualLuz = 0;
		double percentualMercado = 0;
		double percentualEntretenimento = 0;
		double percentualExtra = 0; // Porcentagem da despesa extra (caso tenha).

		// Cassimiro

		System.out.println("Informar o valor da moradia: ");

		@SuppressWarnings("resource")
		Scanner Ler = new Scanner(System.in);

		moradia = Ler.nextInt();

		Soma += moradia;

		System.out.println("Informar o valor da agua: ");
		agua = Ler.nextInt();

		Soma += agua;

		System.out.println("Informar o valor do gasto luz: ");
		luz = Ler.nextInt();

		Soma += luz;

		System.out.println("Informar o valor do entretenimento: ");
		entretenimento = Ler.nextInt();

		Soma += entretenimento;

		System.out.println("Informar o valor do comida: ");
		mercado = Ler.nextInt();

		Soma += mercado;

		System.out.println("Valor total da despesa: " + Soma);

		System.out.println("Deseja informar despesas adicionais? (S/N)");
		continua = Ler.next().toUpperCase().charAt(0);
		if (continua == 'S') {
			System.out.println("Informar despesas adicionais:");
			adicionarMais = Ler.nextInt();

			Soma += adicionarMais;

			System.out.println("Valor total da despesa: " + Soma);

		} else if (continua == 'N') {
			System.out.println("Voc� n�o possui nenhum gasto extra. Continue economizando!");

		}

		// Icru

		// Condi��o caso o usu�rio tenha despesa extra.

		if (adicionarMais > 0) {
			percentualMoradia = (moradia * 100) / renda;

		}

		if (adicionarMais > 0) {
			percentualAgua = (agua * 100) / renda;

		}

		if (adicionarMais > 0) {
			percentualLuz = (luz * 100) / renda;

		}

		if (adicionarMais > 0) {
			percentualMercado = (mercado * 100) / renda;

		}

		if (adicionarMais > 0) {
			percentualEntretenimento = (entretenimento * 100) / renda;

		}

		if (adicionarMais > 0) {
			percentualExtra = (adicionarMais * 100) / renda;

			System.out.println("Da sua renda total, " + percentualMoradia + "% � gasto em moradia.");
			System.out.println("Da sua renda total, " + percentualAgua + "% � gasto em �gua.");
			System.out.println("Da sua renda total, " + percentualLuz + "% � gasto em luz.");
			System.out.println("Da sua renda total, " + percentualMercado + "% � gasto em comida.");
			System.out.println("Da sua renda total, " + percentualEntretenimento + "% � gasto em entretenimento.");
			System.out.println("Da sua renda total, " + percentualExtra + "% � gasto em outros, ou seja, essa � a "
					+ "porcentagem da sua despesa extra.");

		}

		// Condi��o caso o usu�rio n�o tenha renda extra.

		else if (adicionarMais <= 0) {
			percentualMoradia = (moradia * 100) / renda;

		}

		if (adicionarMais <= 0) {
			percentualAgua = (agua * 100) / renda;

		}

		if (adicionarMais <= 0) {
			percentualLuz = (luz * 100) / renda;

		}

		if (adicionarMais <= 0) {
			percentualMercado = (mercado * 100) / renda;

		}

		if (adicionarMais <= 0) {
			percentualEntretenimento = (entretenimento * 100) / renda;

			System.out.println("Da sua renda total, " + percentualMoradia + "% � gasto em moradia.");
			System.out.println("Da sua renda total, " + percentualAgua + "% � gasto em �gua.");
			System.out.println("Da sua renda total, " + percentualLuz + "% � gasto em luz.");
			System.out.println("Da sua renda total, " + percentualMercado + "% � gasto em comida.");
			System.out.println("Da sua renda total, " + percentualEntretenimento + "% � gasto em entretenimento.");
		}
	}
}
