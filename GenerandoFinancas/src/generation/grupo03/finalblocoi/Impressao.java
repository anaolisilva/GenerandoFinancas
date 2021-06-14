package generation.grupo03.finalblocoi;

public class Impressao {
	
	//Ana

	public void Imprimir () {
		
		Despesas despesas = new Despesas();
		Renda rendaTotal = new Renda();
		double renda = rendaTotal.getRendaTotal();
		
		System.out.println("Aqui est� sua tabela de or�amento pessoal. Ela tem o total da sua renda,"
				+ "\nsuas despesas divididas em categorias, e um c�lculo de porcentagem dos seus gastos."
				+ "\nUm exemplo: se sua conta de luz � 10% da sua renda, isso quer dizer que, a cada 100 reais"
				+ "\n que voc� recebe, voc� gasta 10 deles na �gua de luz!"
				+ "\n\n\nAnalisando as porcentagens dos seus gastos voc� pode ver se h� algo que te parece"
				+ "\nestranho: se uma porcentagem est� mais alta do que voc� acha que faz sentido, verifique se"
				+ "\n� poss�vel economizar nessa categoria!\n\n\n\n");
		
		System.out.printf("%3s------------------------------------", ""); 
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5s %%  %s", "|", "RENDA TOTAL", "|", rendaTotal.getRendaTotal(), "|", "+++++", "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Moradia", "|", despesas.getMoradia(), "|", despesas.getPercentualMoradia(renda), "|");
		System.out.printf("%n%3s------------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "�gua", "|", despesas.getAgua(), "|", despesas.getPercentualAgua(), "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Mercado", "|", despesas.getMercado(), "|", despesas.getPercentualMercado(), "|");
		System.out.printf("%n%3s------------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Luz", "|", despesas.getLuz(), "|", despesas.getPercentualLuz(), "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Divers�o", "|", despesas.getEntretenimento(), "|", despesas.getPercentualEntretenimento(), "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Outros", "|", despesas.getTotalOutros(), "|", despesas.getPercentualExtra(), "|");
		System.out.printf("%n%3s------------------------------------", ""); 
		
		System.out.println("\n\n\n\n\n\n\n\n\nVoc� pode salvar essa tabela tirando um print da tela, para ter uma previs�o"
				+ "\nde seus gastos mensais com voc�. Ela tamb�m pode te ajudar a come�ar a economizar, e voc� pode usar nosso"
				+ "\nprograma para gerar as tabelas dos pr�ximos meses e ver sua evolu��o!");
		
		System.out.println("\n\n\n\n\n\nEsperamos ter sido �teis e amig�veis pra voc�!"
				+ "\nSe voc� tem interesse em aprofundar seus conhecimentos em educa��o financeira, voc� pode copiar"
				+ "\ne colar o seguinte link no seu navegador:"
				+ "\n\nhttps://www.caixa.gov.br/Downloads/educacao-financeira-cartilhas/CARTILHA1_EDUCACAO_FINANCEIRA.pdf"
				+ "\n\nEle vai te levar a uma cartilha da Caixa Econ�mica Federal com novos conceitos e explica��es!");
		
		System.out.println("\n\n\n\n\nObrigade por usar nosso programa!\nAt� a pr�xima!\n\n");
		System.out.println("==============================================================================");
		System.out.println();
		System.out.println("                          -----------------                                   ");
		System.out.println("                         | GENERANDO       |                                  ");
		System.out.println("                         |        FINAN�AS |                                  ");
		System.out.println("                          -----------------                                   ");
		System.out.println();
		System.out.println("==============================================================================\n\n\n");

	
	}
	
	

}
