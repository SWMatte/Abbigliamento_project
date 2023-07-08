package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {

	private List<Capo> listaCapi = new ArrayList<>();
	public void add(Capo capo) {
		if(capo !=null){
			listaCapi.add(capo);
		}else{
			new Exception();
		}
		
	}

	public Capo trova(Colore colore) {

		Capo c=  listaCapi.stream()
				 .filter(x->x.getColore().equals(colore)).findFirst().get();

		return c;
	}

	public Capo trova(Materiale materiale) {
		Capo c=  listaCapi.stream()
				.filter(x->x.getMateriale()==materiale).findFirst().get();
		return c;
	}

	public Capo trova(Modello modello) {
		Capo c=  listaCapi.stream()
				.filter(x->x.getModello()==modello).findFirst().get();
		return c;
	}


	public List<Capo> getListaCapi() {
		return listaCapi;
	}

	public void setListaCapi(List<Capo> listaCapi) {
		this.listaCapi = listaCapi;
	}



}
