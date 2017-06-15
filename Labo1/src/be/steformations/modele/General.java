package be.steformations.modele;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class General {

	Set<General> compteGeneral = new TreeSet<General>();
	
	//private TreeMap<String, String> compteGeneral;
	private String numero;
	private String libelle;
	private char position;
	private boolean sub;
	
	public General(String numero2, String libelle2, char position2, boolean sub2) {
		//this.compteGeneral = new TreeMap<>();
		this.numero = "";
		this.libelle = "";
		this.position = ' ';
		this.sub = false;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public void setPosition(char position) {
		this.position = position;
	}
	
	public void setValid(boolean sub) {
		this.sub = sub;
	}

	public boolean isValid() {
		
		return sub;
	}

	public void addtolist() {
		
		compteGeneral.add(new General(numero, libelle, position, sub));
	}
	
}
