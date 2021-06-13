package generation.grupo03.finalblocoi;

public class GenerandoFinancas {
	
	//Ana

	public static void main(String[] args) {
		
		Despesas chamarDespesas = new Despesas();
		Impressao imprimir = new Impressao();
		
		
		chamarDespesas.CalcDespesa(0);
		
		imprimir.Imprimir();

	}

}
