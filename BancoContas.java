package SubSistemas;

import java.util.ArrayList;

public class BancoContas {

	ArrayList<Conta> conta = new ArrayList<Conta>();

	public void cadastro(Conta c) {
		conta.add(c);

	}

	public void cadastrar(Conta contaNova) throws Exception {

		if (verificaContaValida(contaNova)) {

			conta.add(contaNova);
		} else {
			throw new Exception("Ja possuiConta");
		}

	}

	private boolean verificaContaValida(Conta con) {
		for (Conta c : conta) {
			if (con.getId() == c.getId()) {
				return false;
			}
		}
		return true;
	}

	public void retirar(int idConta, double saldo) throws Exception {
		for (Conta c : conta) {
			if (c.getId() == idConta) {
				c.setSaldo(saldo);
			} else {
				throw new Exception("nao realizado");
			}

		}

	}

	public void depositar(int idConta, double saldo) throws Exception {
		for (Conta c : conta) {
			if (c.getId() == idConta) {
				c.setSaldo(saldo);
			} else {
				throw new Exception("nao realizado");
			}
		}

	}

	public double obterSaldo(int id) {
		double sal = 0;
		for (Conta c : conta) {
			if (id == c.getId()) {
				return c.getSaldo();

			}

		}
		return sal;

	}

}
