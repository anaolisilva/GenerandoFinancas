package generation.grupo03.finalblocoi;

public class GenerandoFinancas {
	
	//Ana

	public static void main(String[] args) {
		
		Despesas chamarDespesas = new Despesas();
		Impressao imprimir = new Impressao();
		Reserva chamarReserva = new Reserva();
		Renda chamarRenda = new Renda();
		
		double renda = chamarRenda.CalcRenda();
		double despesas = chamarDespesas.CalcDespesa(0);
		chamarReserva.ChamarReserva(0, despesas);
		imprimir.Imprimir();

	}

}
