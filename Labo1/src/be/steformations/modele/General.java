package be.steformations.modele;

import java.util.TreeMap;

public class General {

	private TreeMap<String, String> compteGeneral;
	private String numero;
	private String libelle;
	private char position;
	private boolean sub;
	
	public General() {
		this.compteGeneral = new TreeMap<>();
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
	
}
