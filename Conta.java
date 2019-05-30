package SubSistemas;

public abstract class Conta {

	public int id;
	public String agencia;
	public int numero;
	public String titular;
	public double saldo;

	
	public void setId(int id) {
		this.id = id;
	}

	public void retirar(double quantia) {
		this.setSaldo(-quantia);
	}

	public void depositar(double quantia) {
		this.setSaldo(+quantia);

	}

	public double obterSaldo() {
		return this.getSaldo();
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	

}
