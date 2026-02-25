package application;

import entities.SobConta;
import entities.SobContaEmpresa;
import entities.SobPoupanca;

public class Sobreposicao {
		public static void main(String[] args) {
			// É a implementação de um método de uma superclasse numa subclasse
			// É fortemente recomendavel usar a anotação @Override num médodo sobrescrito
			// Facilita leitura e compreensão do código
			// É uma boa pratica pois é um aviso ao compidalor
			SobConta conta = new SobConta(1001, "Alex", 1000.00);
			conta.saque(200.0);
			System.out.println(conta.getSaldo());
			
			SobConta contaDois = new SobPoupanca(1002, "Alexie", 1000.00, 0.01);
			contaDois.saque(200.00);
			System.out.println(contaDois.getSaldo());
			
			// É possivel usar a palavra super. para chamar um método da superclasse dentro de um método sobreposto da subclasse
			// Depois de realizar o método ainda daria para modificar ou incluir mais lógica
			
			SobConta contaTres = new SobContaEmpresa(1003, "Alexa", 1000.00, 500.00);
			contaTres.saque(200.00);
			System.out.println(contaTres.getSaldo());
	}
} 
