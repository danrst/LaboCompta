package be.steformations.modele;

import java.util.HashMap;


public class ListeComptesGenereau {
	private  HashMap<String, CompteGeneral> compteGeneral;
	
	public ListeComptesGenereau (){
	this.compteGeneral = new HashMap<>();
	}
	
	public void addToList(CompteGeneral cmpt) {
		String numero = cmpt.getNum();
		String libelle = cmpt.getLibelle();
		char position = cmpt.getPosition();
		boolean sub = cmpt.isSub();
		// TODO verification pour savoir ou va t'en dispatcher
		if (sub && numero.length() < 6 ){
		CompteGeneral cpt = new GeneralSubdivisable (numero, libelle, position, sub);
		compteGeneral.put(numero,cpt);
		}else if (sub && numero.length() == 6 ){
			CompteGeneral cpt = new GeneralSubdivisabkeParticulier (numero, libelle, position, sub);
			compteGeneral.put(numero,cpt);
		}else if (!sub){
			CompteGeneral cpt = new GeneralNonSubdivisable (numero, libelle, position);
			compteGeneral.put(numero,cpt);
		}
	}

}
