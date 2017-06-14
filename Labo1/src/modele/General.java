package modele;

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
	
}
