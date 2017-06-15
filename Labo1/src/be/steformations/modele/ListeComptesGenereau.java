package be.steformations.modele;

import java.util.HashMap;


public class ListeComptesGenereau {
	private HashMap<String, CompteGeneral> compteGeneral;
	
	public ListeComptesGenereau (){
	this.compteGeneral = new HashMap<>();
	}
	
	public void addtolist(String numero, String libelle, char position, boolean sub) {
		
		compteGeneral.put("1",new CompteGeneral (numero, libelle, position, sub));
	}
}
