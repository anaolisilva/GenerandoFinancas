package generation.grupo03.finalblocoi;

public class Impressao {
	
	//Ana

	public void Imprimir () {
		
		Despesas despesas = new Despesas();
		Renda rendaTotal = new Renda();
		
		System.out.printf("%3s------------------------------------", ""); 
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %.2f %% %s", "|", "RENDA TOTAL", "|", rendaTotal.getRendaTotal(), "|", 100.00, "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Moradia", "|", despesas.getMoradia(), "|", despesas.getPercentualMoradia(), "|");
		System.out.printf("%n%3s--------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "�gua", "|", despesas.getAgua(), "|", despesas.getPercentualAgua(), "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Mercado", "|", despesas.getMercado(), "|", despesas.getPercentualMercado(), "|");
		System.out.printf("%n%3s--------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Luz", "|", despesas.getLuz(), "|", despesas.getPercentualLuz(), "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Divers�o", "|", despesas.getEntretenimento(), "|", despesas.getPercentualEntretenimento(), "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Outros", "|", despesas.getOutros(), "|", despesas.getOutros(), "|");
		System.out.printf("%n%3s---------------------------------", ""); 	

	
	}
	
	

}
