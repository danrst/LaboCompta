package be.steformations.modele;

public class CompteGeneral extends Compte {

	private boolean sub;
	private String numero;
	private String libelle;
	private char position;

	public CompteGeneral (String numero2, String libelle2, char position2){
		this.numero = numero2;
		this.libelle = libelle2;
		this.position = position2;
	}
	
	public CompteGeneral() {
		this.sub = false;
		this.numero = "";
		this.libelle = "";
		this.position = 0;
	}

	public void setSub(boolean b) {
		this.sub = true;
	}
	

	public boolean isSub (){
		return sub;
	}

	public void setNum(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
		
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setPosition(char position) {
		this.position = position;
	}
	
	public char getPosition(){
		return position;
	}
}
