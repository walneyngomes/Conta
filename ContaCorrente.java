package SubSistemas;

public class ContaCorrente extends Conta {
	public double limite;

	public void retirar(double quantia) {

		if (this.getlimite() > 0) {
			this.setlimite(-quantia);
			this.setSaldo(-quantia);
		} else {
			System.out.print("Limite Expirado");
		}

	}

	public double getlimite() {
		return limite;
	}

	public void setlimite(double limite) {
		limite = limite;
	}

}
