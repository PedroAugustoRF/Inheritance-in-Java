package application;

import entities.HerancaConta;
import entities.HerancaContaEmpresarial;
import entities.UpDowncastingContaPoupanca;

public class UpcastingDowncasting {
	public static void main(String[] args) {
		// Upcasting: Transformar uma Sub Classe em Super Classe.
		// Usado muito no Polimorfismo
		
		// Downcasting: Transformar uma Super Classe em Sub Classe.
		// instanceof
		// usado em métodos que recebem parâmetros genéricos (Equals)
		
		HerancaConta conta = new HerancaConta(1001, "Pedro", 0.0);
		HerancaContaEmpresarial contaEmpresa = new HerancaContaEmpresarial(1002, "Augusto", 0.0, 1250.00);
		
		// Upcasting
		
		HerancaConta contaUp = contaEmpresa; // contraEmpresa é uma conta, ou seja não da problema ao atribuir
		HerancaConta contaUpNew = new HerancaContaEmpresarial(1999, "João", 0.0, 1000.00); // ContaEmpresarial é uma Conta
		HerancaConta contaPoupanca = new UpDowncastingContaPoupanca(2025, "Carlos", 0.0, 0.25); // ContaPoupanca é uma Conta
		// Em resumo, é completamente normal instanciar um objeto da sub classe em uma super classe
		
		// Downcasting
		
		HerancaContaEmpresarial contaEmpresaDown = (HerancaContaEmpresarial)contaUpNew; // sem fazer o casting (coerção explicita) da erro
		// Ao fazer um downcasting de um objeto que foi feito anteriormente um upcasting, ex:
		// subclasse X foi criada como tipo superclasse Y, no Downcasting esse objeto deve ser uma instancia de tipo igual
		// usamos o termo instanceof
		
		if (contaPoupanca instanceof HerancaContaEmpresarial) {
			HerancaContaEmpresarial contaDown = (HerancaContaEmpresarial)contaPoupanca;
			contaDown.emprestimo(1000);
			System.out.println("Emprestimo!");
		}
		if (contaPoupanca instanceof UpDowncastingContaPoupanca) {
			UpDowncastingContaPoupanca contaEmprestimoDown = (UpDowncastingContaPoupanca)contaPoupanca;
			contaEmprestimoDown.atualizarSaldo();
			System.out.println("Atualizado!");
		}
		
		System.out.println(conta);
		System.out.println(contaUp);
		System.out.println(contaEmpresaDown);
	}
}
