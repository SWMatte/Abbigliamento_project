package models;

public class Modello {

	private String nome;
	private double costoFisso;
	private int quantitaTessuto;




	public Modello() {
	}

	public Modello(String nome, double costoFisso, int quantitaTessuto) {
		this.nome = nome;
		this.costoFisso = costoFisso;
		this.quantitaTessuto = quantitaTessuto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCostoFisso() {
		return costoFisso;
	}

	public void setCostoFisso(double costoFisso) {
		this.costoFisso = costoFisso;
	}

	public double getQuantitaTessuto() {
		return quantitaTessuto;
	}

	public void setQuantitaTessuto(int quantitaTessuto) {
		this.quantitaTessuto = quantitaTessuto;
	}


	@Override
	public String toString() {
		return "Modello{" +
				"nome='" + nome + '\'' +
				", costoFisso=" + costoFisso +
				", quantitaTessuto=" + quantitaTessuto +
				'}';
	}
}
