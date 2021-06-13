package generation.grupo03.finalblocoi;

public class GenerandoFinancas {
	
	//Ana

	public static void main(String[] args) {
		
		Introducao abertura = new Introducao();
		Renda chamarRenda = new Renda();
		Despesas chamarDespesas = new Despesas();
		Impressao imprimir = new Impressao();
		Reserva chamarReserva = new Reserva();
		
		abertura.intro();
		double renda = chamarRenda.CalcRenda();
		double despesas = chamarDespesas.CalcDespesa(renda);
		chamarReserva.ChamarReserva(renda, despesas);
		imprimir.Imprimir();

	}

}
