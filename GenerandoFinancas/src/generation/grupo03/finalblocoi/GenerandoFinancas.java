package generation.grupo03.finalblocoi;

public class GenerandoFinancas {
	
	//Ana

	public static void main(String[] args) {
		
		Renda chamarRenda = new Renda();
		Despesas chamarDespesas = new Despesas();
		Impressao imprimir = new Impressao();
		Reserva chamarReserva = new Reserva();
		
		
		double renda = chamarRenda.CalcRenda();
		double despesas = chamarDespesas.CalcDespesa(renda);
		chamarReserva.ChamarReserva(renda, despesas);
		imprimir.Imprimir();

	}

}
