package be.steformations.modele;

import java.util.TreeMap;

public class ListeComptesGenereau {
	private TreeMap<String, CompteGeneral> compteGeneral;
	
	public ListeComptesGenereau (){
	this.compteGeneral = new TreeMap<>();
	}
	
	public void addtolist(String numero, String libelle, char position, boolean sub) {
		
		compteGeneral.add(numero, libelle, position, sub);
	}
}
