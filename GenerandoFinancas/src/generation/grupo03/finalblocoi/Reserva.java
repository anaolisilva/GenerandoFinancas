package generation.grupo03.finalblocoi;

import java.util.Scanner;

public class Reserva {
	
	//Thana
	
	public void ChamarReserva (double totalRenda, double totalDespesas) {
		
		 double sobra = (totalRenda - totalDespesas);
		 double valorGuardar = (sobra / 2);
		 double objetivo = (valorGuardar * 6);
		
		String textoObj;
		char projecao, reserva;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Essa � a quantia que te sobra todo m�s: R$ %.2f \n", sobra);
		if (sobra < 0 ) {
			System.out.println("\nCuidado! Voc� est� gastando mais do que ganhando. Voc� deve dar seu jeitinho todo m�s, "
					+ "\nmas o ideal � que voc� consiga englobar todos os seus gastos nos seus ganhos. Sabemos que isso n�o � f�cil,"
					+ "\npor isso estamos te ensinando como iniciar um planejamento financeiro!");
		} //Coloquei essa condi��o caso a pessoa gaste mais que receba
		
		System.out.println("\n\nAgora vamos falar de poupar!\n\n\n");
		System.out.println("Voc� tem uma reserva de emerg�ncia? (S/N)");
		reserva = scan.next().toUpperCase().charAt(0);
		
		if(reserva == 'S') {
			
			System.out.printf("\n\n\nQue �timo! \nTer uma reserva financeira � a melhor maneira de estar"
					+ " preparado para\nacontecimentos inesperados, tendo mais seguran�a e tranquilidade."
					+ "\n\nDe acordo com o seu c�lculo financeiro, voc� tem R$ %.2f livres por m�s."
		    		+ "\nVoc� pode, por exemplo, guardar R$ %.2f  na sua reserva financeira!"
		    		+ "\n\nDessa forma, consegue ter uma folga no m�s, para gastos inesperados (ou at� pequenos mimos)"
		    		+ "\ne mesmo assim se previnir e guardar dinheiro, para continuar agregando � sua reserva "
		    		+ "\ne ficar cada vez mais previnido financeiramente!", sobra, valorGuardar);
			//Adicionei coisas sobre agregar � reserva e porque guardar sobra/2.
		}
		else {
			System.out.println("\n\n\nSem problemas! Podemos te ajudar com isso.\n" + 
					"\nA reserva financeira � a melhor solu��o para resolver imprevistos que exijam "
					+ "\ndinheiro, al�m de ser uma �tima maneira de conseguir alcan�ar seus objetivos." 
					+"\nAo contar com ela, voc� evita apertos e transtornos emocionais, ao mesmo tempo"
					+ "\nem que consegue se manter longe de empr�stimos\nbanc�rios a juros abusivos, que te cobram"
					+ "\nmuito mais do que te emprestam!\n\n\n"
					+ "O primeiro passo para montar sua reserva financeira envolve dois pontos bastante"
					+ "\nb�sicos, mas frequentemente ignorados pela maioria"
					+ "\ndas pessoas: gastar menos do que ganha e poupar uma quantia mensal.\n"
					+ "\n\nEnfim, como come�ar?\n\n"
					+ "\nColoque como meta, por exemplo, guardar metade do valor que sobra das suas despesas mensais"
					+ "\n(� ainda melhor guardar 100% do valor, quando poss�vel, mas deixar a outra parte da sobra"
					+ "\ncomo dinheiro de f�cil acesso pode te ajudar com pequenos gastos inesperados - ou pequenos mimos).");
			
			//Explicar que d� para deixar a outra metade do que sobra como garantia, uma folga caso aconte�a algo naquele m�s espec�fico - Ana
			
			
			System.out.printf("\nDe acordo com o seu c�lculo financeiro, voc� tem R$ %.2f livres por m�s.", sobra);
			System.out.printf("\n\nVoc� pode come�ar a guardar R$ %.2f nna sua reserva financeira todo m�s!", valorGuardar);
			System.out.println("\nPode parecer pouco, mas ao longo dos meses essa quantia se acumula e vai te dar seguran�a.");
			//Coloquei um complemento do tipo "mesmo que pare�a pouco, � importante, vai acumulando ao longo dos meses, etc. - Ana
		}
		
		scan.nextLine();
		System.out.println("\nVoc� tem alguma meta ou objetivo a longo prazo? (S/N)");
		projecao = scan.next().toUpperCase().charAt(0);
		
		if(projecao == 'S') {
			
			System.out.println("Qual?");
			textoObj = scan.next();
			
			System.out.println("\nFicamos muito felizes em saber! Uma meta � muito importante, porque permite"
					+ "\nque voc� alcance um sonho ou desejo que possa parecer irreal nesse momento para voc�,"
					+ "\nmas com dedica��o e disciplina financeira, voc� consegue.");
			
			System.out.println("\nFizemos uma proje��o de 6 meses para voc�: ");
			System.out.printf("\nSe voc� guardar R$ %.2f durante 6 meses, voc� ter� juntado R$ %.2f "
					+ "\ne estar� mais perto de conseguir %s", valorGuardar, objetivo, textoObj +
					"\n\nMas lembre-se que sempre manter uma quantia de emerg�ncia na sua reserva � muito importante!!!");
			
		}
		else {
			System.out.println("\nTudo bem, vamos te ajudar a sonhar e comecar a estabelecer metas!"
					+"\nA import�ncia de ter metas e objetivos est� no poder que isso tem de nos motivar."
					+ "\nSem eles, vivemos como barcos � deriva, sem rumo e sem orienta��o. J� o contr�rio acontece"
					+ "\nquando fazemos quest�o de determinar o que queremos. Pois a partir disso, n�s sabemos para onde"
					+ "\nestamos indo. E empregamos atitudes di�rias para chegar neste lugar, ou seja, em nosso estado desejado.");
			
			System.out.println("\nFizemos uma proje��o de 6 meses para voc�: "
					+ "\nSe voc� guardar R$" + valorGuardar + " durante 6 meses, voc� ter� juntado R$" + objetivo
				    + " para poder aplicar nas suas metas e objetivos, "
				    + "\nmas n�o se esque�a que sempre mante uma quantia de emerg�ncia na sua reserva � "
				    + "*muito importante*!!!");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
	

}
