package Facade;

import SubSistemas.BancoContas;
import SubSistemas.Conta;

public class FacadeConta {
	private BancoContas contas;

	public FacadeConta() {
		this.contas = new BancoContas();
	}

	public void cadastrarConta(Conta conta) {
		contas.cadastro(conta);
	}

	public void retirar(int idConta, double saldo) throws Exception {
		contas.retirar(idConta, saldo);
	}

	public void depositar(int idConta, double saldo) throws Exception {
		contas.depositar(idConta, saldo);

	}

	public double obterSaldo(int id) {
		return contas.obterSaldo(id);
	}
}
