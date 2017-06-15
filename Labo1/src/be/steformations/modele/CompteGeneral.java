package be.steformations.modele;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class CompteGeneral {

	
	
	private String numero;
	private String libelle;
	private char position;
	private boolean sub;
	
	public CompteGeneral() {
		super();
		this.numero = "";
		this.libelle = "";
		this.position = ' ';
		this.sub = false;
	}

	public CompteGeneral(Object numero2, Object libelle2, Object position2, Object sub2) {
		// TODO Auto-generated constructor stub
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
