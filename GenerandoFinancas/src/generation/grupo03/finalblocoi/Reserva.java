package generation.grupo03.finalblocoi;

import java.util.Scanner;

public class Reserva {
	
	//Thana
	
	public static void ChamarReserva (double totalRenda, double totalDespesas) {
		
		 double sobra =(totalRenda - totalDespesas);
		 double valorGuardar = (sobra / 2);
		 double objetivo = (valorGuardar * 6);
		
		String reserva, projecao, textoObj;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Voc� tem uma reserva de emerg�ncia?");
		reserva = scan.next();
		
		if(reserva.equals("sim")) {
			
			System.out.println("\nQue �timo! \nTer uma reserva financeira � a melhor maneira de estar"
					+ " preparado para\nacontecimentos inesperados, tendo mais seguran�a e tranquilidade."
					+ "\n\nDe acordo com o seu c�lculo financeiro, voc� tem R$" + sobra + " livres por m�s,"
		    		+ "\nvoc� pode, por exemplo, guardar R$" + valorGuardar + " na sua reserva financeira!");
			//Aqui acho legal colocar um "para continuar agregando sempre a esse valor!
		}
		else {
			System.out.println("\nSem problemas! Podemos te ajudar com isso.\n" + "\nA reserva financeira pode ser a melhor solu��o para resolver imprevistos, "
					+ "\nal�m de ser uma �tima maneira de conseguir alcan�ar seus objetivos." 
					+"\nAo contar com ela, voc� evita apertos e transtornos emocionais,"
					+ "\nao mesmo tempo em que consegue se manter longe de empr�stimos\nbanc�rios a juros abusivos.\n\n"
					+ "O primeiro passo para montar sua reserva financeira envolve dois"
					+ "\npontos bastante b�sicos, mas frequentemente ignorados pela maioria"
					+ "\ndas pessoas: gastar menos do que ganha e poupar uma quantia mensal.\n"
					+ "\nEnfim, como come�ar?\n"
					+ "\nColoque como meta, por exemplo, guardar metade do valor que sobra das suas"
					+ "\ndespesas mensais (seria ainda melhor guardar 100% do valor, quando poss�vel!).");
			
			//Explicar que d� para deixar a outra metade do que sobra como garantia, uma folga caso aconte�a algo naquele m�s espec�fico
			
			
			System.out.println("\nDe acordo com o seu c�lculo financeiro, voc� tem R$" + sobra + " livres esse m�s," 
				    + "\no valor que voc� pode come�ar a guardar na sua reserva financeira � de: R$" + valorGuardar);
			//Pensar em colocar um complemento do tipo "mesmo que pare�a pouco, � importante, vai acumulando ao longo dos
			//meses, etc.
		}
		
		scan.nextLine();
		System.out.println("\nVoc� tem alguma meta ou objetivo a longo prazo?");
		projecao = scan.next();
		
		if(projecao.equals("sim")) {
			
			System.out.println("Qual?");
			textoObj = scan.next();
			
			System.out.println("\nFicamos muito felizes em saber! Uma meta � muito importante, porque permite"
					+ "\nque voc� alcance um sonho ou desejo que possa parecer irreal nesse momento para voc�,"
					+ "\nmas com dedica��o e disciplina financeira, voc� consegue.");
			
			System.out.println("\nFizemos uma proje��o de 6 meses para voc�: "
					+ "\nSe voc� guardar R$" + valorGuardar + " durante 6 meses, voc� ter� juntado R$" + objetivo
					+ " e estar� mais perto de conseguir" + textoObj
					+ "\nMas lembre-se que sempre manter uma quantia de emerg�ncia na sua reserva � muito importante!!!");
			
		}
		else {
			System.out.println("\nTudo bem, vamos te ajudar a sonhar e comecar a estabelecer metas!"
					+"\nA import�ncia de ter metas e objetivos, est� no poder que isso tem de nos motivar."
					+ "\nSem eles, vivemos como barcos � deriva, sem rumo e sem orienta��o. J� o contr�rio acontece"
					+ "\nquando fazemos quest�o de determinar o que queremos. Pois a partir disso, n�s sabemos para onde"
					+ "\nestamos indo. E empregamos a��es di�rias para chegar neste lugar, ou seja, em nosso estado desejado.");
			
			System.out.println("\nFizemos uma proje��o de 6 meses para voc�: "
					+ "\nSe voc� guardar R$" + valorGuardar + " durante 6 meses, voc� ter� juntado R$" + objetivo
				    + " para poder aplicar nas suas metas e objetivos, mas n�o se esque�a que sempre manter"
				    + "\numa quantia de emerg�ncia na sua reserva � muito importante!!!");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
	

}
