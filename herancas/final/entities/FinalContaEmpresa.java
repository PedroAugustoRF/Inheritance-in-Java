package entities;

public class FinalContaEmpresa extends FinalConta{
	private Double limiteEmprestimo = null;

	public FinalContaEmpresa() {}
	public FinalContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestimo)
			deposito(quantia);
	}
	
	@Override
	 public void saque(Double quantia) {
		 super.saque(quantia);
		 saldo -= 2.0;
	 }
}
