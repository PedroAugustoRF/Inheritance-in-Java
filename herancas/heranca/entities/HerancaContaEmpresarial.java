package entities;
// depois do public class colocamos extends
public class HerancaContaEmpresarial extends HerancaConta{
	private Double limiteEmprestimo = null;

	public HerancaContaEmpresarial() {
		super();
	}
	// É importante usar o construtor com os atritos da superclasse
	public HerancaContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo); // palavra chave do construtor da superclasse
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
			saldo += quantia - 10.0;
			// Ou: 
			deposito(quantia);
	}
	// Se usa protected pra uma classe que herda outra, acesse seus atributos
}
