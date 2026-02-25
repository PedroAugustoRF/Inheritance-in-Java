package entities;

public class SobPoupanca extends SobConta{
	private Double taxaDeJuros = null;
	 
	 public SobPoupanca() {
		 super();
	 }

	 public SobPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
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
	 public void saque(Double quantia) {
		 saldo -= quantia;
	 }
}
