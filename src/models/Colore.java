package models;

public class Colore {

	 private String nome;

	public Colore(String nome) {
		this.nome = nome;
	}

	public Colore() {
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Colore{" +
				"nome='" + nome + '\'' +
				'}';
	}
}
