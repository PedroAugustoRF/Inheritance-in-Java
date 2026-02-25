package entities;

public final class FinalPoupanca extends FinalConta { // como FinalPoupanca é uma final class, ela não pode ser herdada
	private Double taxaDeJuros = null;
	 
	 public FinalPoupanca() {}
	 public FinalPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	 }

	 public Double getTaxaDeJuros() {
		 return taxaDeJuros;
	 }
	 public void setTaxaDeJuros(Double taxaDeJuros) {
		 this.taxaDeJuros = taxaDeJuros;
	 }
	 
	 public void atualizarSaldo() {
		 saldo += saldo * taxaDeJuros;
	 }
	 
	 @Override
	 public final void saque(Double quantia) { // como saque é uma final, ela não pode ser sobreescrita
		 saldo -= quantia;
	 }
}
