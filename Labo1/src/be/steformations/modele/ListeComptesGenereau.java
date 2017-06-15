package be.steformations.modele;

import java.util.TreeMap;

public class ListeComptesGenereau {
	private TreeMap<String, CompteGeneral> compteGeneral;
	
	public ListeComptesGenereau (){
	this.compteGeneral = new TreeMap<>();
	}
	
	public void addtolist(Object numero, Object libelle, Object position, Object sub) {
		
		compteGeneral.add(new CompteGeneral(numero, libelle, position, sub));
	}
}
