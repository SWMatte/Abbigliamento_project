package models;

public class Materiale {

	private String nome;
	private double costo;


	public Materiale(String nome, double costo) {
		this.nome = nome;
		this.costo = costo;
	}

	public Materiale() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}


	@Override
	public String toString() {
		return "Materiale{" +
				"nome='" + nome + '\'' +
				", costo=" + costo +
				'}';
	}
}
