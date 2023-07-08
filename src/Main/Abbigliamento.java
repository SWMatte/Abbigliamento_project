package Main;

import models.*;

public class Abbigliamento {

	public static void main(String[] args) {
		//setto nome colore
		Colore c = new Colore("Rosso");
		Colore c1 = new Colore("Blu");

		//setto materiale
		Materiale m = new Materiale("acrilico",22.00);
		Materiale m1 = new Materiale("cotone",59.00);


		//setto modello
		Modello mod = new Modello("dolce G",10.04,3);
		Modello mod1 = new Modello("armani",203.33,12);


		//setto il capo
		Capo capo1 = new Capo(mod1,m1,c1);
		Capo capo = new Capo(mod,m,c);


		double prezzoCapo = capo.prezzo(mod, m);
		double prezzoArrotondato = Math.round(prezzoCapo * 100.0) / 100.0;
 		System.out.println("---------------------");
		System.out.println(capo);



		System.out.println("/n " + prezzoArrotondato + "/n");

		//setto la collezione
		Collezione coll = new Collezione();
		coll.add(capo);
		coll.add(capo1);

		System.out.println("capo colore "+ coll.trova(c1));	// trova capo by colore

		System.out.println("capo modello "+coll.trova(mod)); // trova capo by modello

		System.out.println("capo materiale "+ coll.trova(m1));	//trova capo by materiale















	}


}
