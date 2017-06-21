package be.steformations.modele;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ListeComptesGenereau {
	private HashMap<String, CompteGeneral> compteGeneral;

	public ListeComptesGenereau() {
		this.compteGeneral = new HashMap<>();
	}

	public boolean addToList(CompteGeneral cmpt) {
		String numero = cmpt.getNumero();
		String libelle = cmpt.getLibelle();
		char position = cmpt.getPosition();
		boolean sub = cmpt.isSub();

		boolean ajoutOK = false;
		ajoutOK = compteGeneral.containsKey(numero);
		System.out.println("Le hashMap contien déjà le numero ? " + ajoutOK);

		/*
		 * Iterator it = compteGeneral.keySet().iterator(); while
		 * (it.hasNext()){ if ()
		 * 
		 * }
		 */
		if (!(ajoutOK)) {
			if (sub && numero.length() < 6) {
				
				CompteGeneral cpt = new GeneralSubdivisable(numero, libelle, position, sub);
				compteGeneral.put(numero, cpt);
				System.out.println("Taille de map après ajout: "+ compteGeneral.size());
				
			} else if (sub && numero.length() == 6) {
				CompteGeneral cpt = new GeneralSubdivisabkeParticulier(numero, libelle, position, sub);
				compteGeneral.put(numero, cpt);
			} else if (!sub) {
				CompteGeneral cpt = new GeneralNonSubdivisable(numero, libelle, position);
				compteGeneral.put(numero, cpt);
			}
		}
		return ajoutOK;
	}

}
