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
		
		System.out.printf("Essa é a quantia que te sobra todo mês: R$ %.2f \n", sobra);
		if (sobra < 0 ) {
			System.out.println("\nCuidado! Você está gastando mais do que ganhando. Você deve dar seu jeitinho todo mês, "
					+ "\nmas o ideal é que você consiga englobar todos os seus gastos nos seus ganhos. Sabemos que isso não é fácil,"
					+ "\npor isso estamos te ensinando como iniciar um planejamento financeiro!");
		} //Coloquei essa condição caso a pessoa gaste mais que receba
		
		System.out.println("\n\nAgora vamos falar de poupar!\n\n\n");
		System.out.println("Você tem uma reserva de emergência? (S/N)");
		reserva = scan.next().toUpperCase().charAt(0);
		
		if(reserva == 'S') {
			
			System.out.printf("\n\n\nQue ótimo! \nTer uma reserva financeira é a melhor maneira de estar"
					+ " preparado para\nacontecimentos inesperados, tendo mais segurança e tranquilidade."
					+ "\n\nDe acordo com o seu cálculo financeiro, você tem R$ %.2f livres por mês."
		    		+ "\nVocê pode, por exemplo, guardar R$ %.2f  na sua reserva financeira!"
		    		+ "\n\nDessa forma, consegue ter uma folga no mês, para gastos inesperados (ou até pequenos mimos)"
		    		+ "\ne mesmo assim se previnir e guardar dinheiro, para continuar agregando à sua reserva "
		    		+ "\ne ficar cada vez mais previnido financeiramente!", sobra, valorGuardar);
			//Adicionei coisas sobre agregar à reserva e porque guardar sobra/2.
		}
		else {
			System.out.println("\n\n\nSem problemas! Podemos te ajudar com isso.\n" + 
					"\nA reserva financeira é a melhor solução para resolver imprevistos que exijam "
					+ "\ndinheiro, além de ser uma ótima maneira de conseguir alcançar seus objetivos." 
					+"\nAo contar com ela, você evita apertos e transtornos emocionais, ao mesmo tempo"
					+ "\nem que consegue se manter longe de empréstimos\nbancários a juros abusivos, que te cobram"
					+ "\nmuito mais do que te emprestam!\n\n\n"
					+ "O primeiro passo para montar sua reserva financeira envolve dois pontos bastante"
					+ "\nbásicos, mas frequentemente ignorados pela maioria"
					+ "\ndas pessoas: gastar menos do que ganha e poupar uma quantia mensal.\n"
					+ "\n\nEnfim, como começar?\n\n"
					+ "\nColoque como meta, por exemplo, guardar metade do valor que sobra das suas despesas mensais"
					+ "\n(é ainda melhor guardar 100% do valor, quando possível, mas deixar a outra parte da sobra"
					+ "\ncomo dinheiro de fácil acesso pode te ajudar com pequenos gastos inesperados - ou pequenos mimos).");
			
			//Explicar que dá para deixar a outra metade do que sobra como garantia, uma folga caso aconteça algo naquele mês específico - Ana
			
			
			System.out.printf("\nDe acordo com o seu cálculo financeiro, você tem R$ %.2f livres por mês.", sobra);
			System.out.printf("\n\nVocê pode começar a guardar R$ %.2f nna sua reserva financeira todo mês!", valorGuardar);
			System.out.println("\nPode parecer pouco, mas ao longo dos meses essa quantia se acumula e vai te dar segurança.");
			//Coloquei um complemento do tipo "mesmo que pareça pouco, é importante, vai acumulando ao longo dos meses, etc. - Ana
		}
		
		scan.nextLine();
		System.out.println("\nVocê tem alguma meta ou objetivo a longo prazo? (S/N)");
		projecao = scan.next().toUpperCase().charAt(0);
		
		if(projecao == 'S') {
			
			System.out.println("Qual?");
			textoObj = scan.next();
			
			System.out.println("\nFicamos muito felizes em saber! Uma meta é muito importante, porque permite"
					+ "\nque você alcance um sonho ou desejo que possa parecer irreal nesse momento para você,"
					+ "\nmas com dedicação e disciplina financeira, você consegue.");
			
			System.out.println("\nFizemos uma projeção de 6 meses para você: ");
			System.out.printf("\nSe você guardar R$ %.2f durante 6 meses, você terá juntado R$ %.2f "
					+ "\ne estará mais perto de conseguir %s", valorGuardar, objetivo, textoObj +
					"\n\nMas lembre-se que sempre manter uma quantia de emergência na sua reserva é muito importante!!!");
			
		}
		else {
			System.out.println("\nTudo bem, vamos te ajudar a sonhar e comecar a estabelecer metas!"
					+"\nA importância de ter metas e objetivos está no poder que isso tem de nos motivar."
					+ "\nSem eles, vivemos como barcos à deriva, sem rumo e sem orientação. Já o contrário acontece"
					+ "\nquando fazemos questão de determinar o que queremos. Pois a partir disso, nós sabemos para onde"
					+ "\nestamos indo. E empregamos atitudes diárias para chegar neste lugar, ou seja, em nosso estado desejado.");
			
			System.out.println("\nFizemos uma projeção de 6 meses para você: "
					+ "\nSe você guardar R$" + valorGuardar + " durante 6 meses, você terá juntado R$" + objetivo
				    + " para poder aplicar nas suas metas e objetivos, "
				    + "\nmas não se esqueça que sempre mante uma quantia de emergência na sua reserva é "
				    + "*muito importante*!!!");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
	

}
