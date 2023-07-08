package models;

public class Capo {

	private Modello modello;
	private Materiale materiale;
	private Colore colore;



	public Capo(Modello modello, Materiale materiale, Colore colore) {
		 this.modello=modello;
		 this.materiale = materiale;
		 this.colore=colore;
	}

	public double prezzo(Modello m, Materiale materiale) {

	double prezzo= m.getCostoFisso()+ ( m.getQuantitaTessuto()*materiale.getCosto());

 		return prezzo;
	}



	public Modello getModello() {
		return modello;
	}

	public void setModello(Modello modello) {
		this.modello = modello;
	}

	public Materiale getMateriale() {
		return materiale;
	}

	public void setMateriale(Materiale materiale) {
		this.materiale = materiale;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return
				"<modello>"+ modello +
				", <colore>" + colore +
				"di <materiale>" + materiale;
	}
}
