package bloco1.java.projeto.reserva;

import java.util.Scanner;

public class Reserva {
	
	public static void main(String[] args) {
		
		double renda = 1000, despesas = 800;
		double sobra =(renda - despesas);
		double valorGuardar = (sobra / 2);
		double objetivo = (valorGuardar * 6);
		
		String reserva, projecao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Você tem uma reserva de emergência?");
		reserva = scan.next();
		
		if(reserva.equals("sim")) {
			
			System.out.println("\nQue ótimo! \nTer uma reserva financeira é a melhor maneira de estar"
					+ " preparado para\nacontecimentos inesperados, tendo mais segurança e tranquilidade."
					+ "\n\nDe acordo com o seu cálculo financeiro, você tem R$" + sobra + " livres esse mês,"
		    		+ "\nvocê pode por exemplo, guardar R$" + valorGuardar + " na sua reserva financeira!");
			
		}
		else {
			System.out.println("\nSem problemas! Podemos te ajudar com isso.\n" + "\nA reserva financeira pode ser a melhor solução para resolver imprevistos, "
					+ "\nalém de ser uma ótima maneira de conseguir alcançar seus objetivos." 
					+"\nAo contar com ela, você evita apertos e transtornos emocionais,"
					+ "\nao mesmo tempo em que consegue se manter longe de empréstimos\nbancários a juros abusivos.\n\n"
					+ "O primeiro passo para montar sua reserva financeira envolve dois"
					+ "\npontos bastante básicos,mas frequentemente ignorados pela maioria"
					+ "\ndas pessoas: gastar menos do que ganha e poupar uma quantia mensal.\n"
					+ "\nEnfim, como começar?\n"
					+ "\nColoque como meta, por exemplo, guardar metade do valor que sobra das suas"
					+ "\ndespesas mensais (seria ainda melhor guardar 100% do valor, quando pssível!).");
			
			
			System.out.println("\nDe acordo com o seu cálculo financeiro, você tem R$" + sobra + " livres esse mês," 
				    + "\no valor que você pode começar a guardar na sua reserva financeira é de: R$" + valorGuardar);
		}
		
		scan.nextLine();
		System.out.println("\nVocê tem alguma meta ou objetivo a longo prazo?");
		projecao = scan.next();
		
		if(projecao.equals("sim")) {
			
			System.out.println("Qual?");
			scan.next();
			
			System.out.println("\nFicamos muito felizes em saber! Uma meta é muito importante, porque permite"
					+ "\nque você alcance um sonho ou desejo que possa parecer irreal nesse momento para você,"
					+ "\nmas com dedicação e disciplina financeira, você consegue.");
			
			System.out.println("\nFizemos uma projeção de 6 meses para você: "
					+ "\nSe você guardar R$" + valorGuardar + " durante 6 mêses, você terá juntado R$" + objetivo
					+ " e estará mais perto de conseguir atingir sua meta/objetivo!"
					+ "\nMas lembre-se que sempre manter uma quantia de emergência na sua reserva é muito importante!!!");
			
		}
		else {
			System.out.println("\nTudo bem, vamos te ajudar a sonhar e comecar a estabelecer metas!"
					+"\nA importância de ter metas e objetivos, está no poder que isso tem de nos motivar,"
					+ "\nSem eles, vivemos como barcos à deriva, sem rumo e sem orientação. Já o contrário acontece"
					+ "\nquando fazemos questão de determinar o que queremos. Pois a partir disso, nós sabemos para onde"
					+ "\nestamos indo. E empregamos ações diárias para chegar neste lugar, ou seja, em nosso estado desejado.");
			
			System.out.println("\nFizemos uma projeção de 6 meses para você: "
					+ "\nSe você guardar R$" + valorGuardar + " durante 6 mêses, você terá juntado R$" + objetivo
				    + " para poder aplicar nas suas metas e objetivos, mas não se esqueça que sempre manter"
				    + "\numa quantia de emergência na sua reserva é muito importante!!!");
		}
		
		scan.close();	
	}
	

}
