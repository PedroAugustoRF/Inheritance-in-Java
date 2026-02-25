package entities;

public class HerancaConta {
	private Integer numero = null;
	private String titular = null;
	protected Double saldo = null;
	
	public HerancaConta() {}
	public HerancaConta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(Double quantia) {
		saldo -= quantia;
	}
	
	public void deposito(Double quantia) {
		saldo += quantia;
	}
}
 