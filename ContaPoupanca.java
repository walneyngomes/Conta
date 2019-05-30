package SubSistemas;

public class ContaPoupanca extends Conta {
	public int aniversario;

	public void retirar(double quantia) {
		this.setSaldo(-quantia);

	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

}
