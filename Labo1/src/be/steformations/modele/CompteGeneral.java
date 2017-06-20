package be.steformations.modele;

public class CompteGeneral extends Compte {

	public boolean sub;
	public String numero;
	public String libelle;
	public char position;
	//private TreeMap<String, Item> itemMap;

	public CompteGeneral (){
		this.sub = false;
		this.numero = "";
		this.libelle = "";
		this.position = ' ';
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
	
	public String getNum() {
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
