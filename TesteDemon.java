package Teste;

import java.util.Scanner;

import Facade.FacadeConta;
import SubSistemas.Conta;

public class TesteDemon {
	public static void main(String[] args) throws Exception {

		FacadeConta contaFacade = new FacadeConta();
		FactoryConta conta = new FactoryConta();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual tipo de conta?");
		String tipo = teclado.nextLine();

		Conta c = conta.obterConta(tipo);
		c.setId(2);
		c.setNumero(23123);
		c.setSaldo(30.223);
		c.setTitular("Walney Negreiros");
		contaFacade.cadastrarConta(c);

		System.out.println(contaFacade.obterSaldo(2));

		contaFacade.depositar(2, 1);

		System.out.println(contaFacade.obterSaldo(2));

	}

}
