package Teste;

import SubSistemas.Conta;
import SubSistemas.ContaCorrente;
import SubSistemas.ContaPoupanca;

public class FactoryConta {

	public Conta obterConta(String tipo) {
		Conta conta = null;
		if ("poupanca".equals(tipo)) {
			conta = new ContaPoupanca();
		} else if ("corrente".equals(tipo)) {
			conta = new ContaCorrente();

		}
		return conta;
	}

}
