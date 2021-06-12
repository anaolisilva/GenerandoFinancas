package generation.grupo03.finalblocoi;

public class Impressao {
	
	//Ana

	public static void main(String[] args) {
		
		double rendaTotal = 0, despesasTotal, porcentagem,  moradia =0, agua =0, luz =0, entretenimento =0, comida =0,
				outros =0;
		double porctMoradia = 0, porctAgua = 0, porctLuz =0, porctEntr =0, porctComida =0, porctOutros=0;
		
		System.out.printf("%3s————————————————————————————————", ""); 
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %.2f %% %s", "|", "RENDA TOTAL", "|", rendaTotal, "|", 100.00, "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Moradia", "|", moradia, "|", porctMoradia, "|");
		System.out.printf("%n%3s--------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "água", "|", agua, "|", porctAgua, "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Moradia", "|", comida, "|", porctComida, "|");
		System.out.printf("%n%3s--------------------------------", "");
	
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Luz", "|", luz, "|", porctLuz, "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Diversão", "|", entretenimento, "|", porctEntr, "|");
		System.out.printf("%n%3s--------------------------------", "");
		
		System.out.printf("%n%3s %-11S%3s %.2f %s %5.2f %%  %s", "|", "Outros", "|", outros, "|", porctOutros, "|");
		System.out.printf("%n%3s————————————————————————————————", ""); 	

	
	}
	
	

}
