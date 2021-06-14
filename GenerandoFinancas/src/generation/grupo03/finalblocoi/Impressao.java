package generation.grupo03.finalblocoi;

public class Impressao {
	
	//Ana

	public void Imprimir () {
		
		Despesas despesas = new Despesas();
		Renda rendaTotal = new Renda();
		double renda = rendaTotal.getRendaTotal();
		
		System.out.println("Aqui está sua tabela de orçamento pessoal. Ela tem o total da sua renda,"
				+ "\nsuas despesas divididas em categorias, e um cálculo de porcentagem dos seus gastos."
				+ "\nUm exemplo: se sua conta de luz é 10% da sua renda, isso quer dizer que, a cada 100 reais"
				+ "\n que você recebe, você gasta 10 deles na água de luz!"
				+ "\n\n\nAnalisando as porcentagens dos seus gastos você pode ver se há algo que te parece"
				+ "\nestranho: se uma porcentagem está mais alta do que você acha que faz sentido, verifique se"
				+ "\né possível economizar nessa categoria!\n\n\n\n");
		
		System.out.printf("%3s------------------------------------", ""); 
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5s %%  %s", "|", "RENDA TOTAL", "|", rendaTotal.getRendaTotal(), "|", "+++++", "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Moradia", "|", despesas.getMoradia(), "|", despesas.getPercentualMoradia(renda), "|");
		System.out.printf("%n%3s------------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "água", "|", despesas.getAgua(), "|", despesas.getPercentualAgua(), "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Mercado", "|", despesas.getMercado(), "|", despesas.getPercentualMercado(), "|");
		System.out.printf("%n%3s------------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Luz", "|", despesas.getLuz(), "|", despesas.getPercentualLuz(), "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Diversão", "|", despesas.getEntretenimento(), "|", despesas.getPercentualEntretenimento(), "|");
		System.out.printf("%n%3s------------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %-8.2f %1s %5.2f %%  %s", "|", "Outros", "|", despesas.getTotalOutros(), "|", despesas.getPercentualExtra(), "|");
		System.out.printf("%n%3s------------------------------------", ""); 
		
		System.out.println("\n\n\n\n\n\n\n\n\nVocê pode salvar essa tabela tirando um print da tela, para ter uma previsão"
				+ "\nde seus gastos mensais com você. Ela também pode te ajudar a começar a economizar, e você pode usar nosso"
				+ "\nprograma para gerar as tabelas dos próximos meses e ver sua evolução!");
		
		System.out.println("\n\n\n\n\n\nEsperamos ter sido úteis e amigáveis pra você!"
				+ "\nSe você tem interesse em aprofundar seus conhecimentos em educação financeira, você pode copiar"
				+ "\ne colar o seguinte link no seu navegador:"
				+ "\n\nhttps://www.caixa.gov.br/Downloads/educacao-financeira-cartilhas/CARTILHA1_EDUCACAO_FINANCEIRA.pdf"
				+ "\n\nEle vai te levar a uma cartilha da Caixa Econômica Federal com novos conceitos e explicações!");
		
		System.out.println("\n\n\n\n\nObrigade por usar nosso programa!\nAté a próxima!\n\n");
		System.out.println("==============================================================================");
		System.out.println();
		System.out.println("                          -----------------                                   ");
		System.out.println("                         | GENERANDO       |                                  ");
		System.out.println("                         |        FINANÇAS |                                  ");
		System.out.println("                          -----------------                                   ");
		System.out.println();
		System.out.println("==============================================================================\n\n\n");

	
	}
	
	

}
