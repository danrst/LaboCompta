package be.steformations.controle;

import java.util.Scanner;

import be.steformations.modele.CompteGeneral;
import be.steformations.vue.Vue;

public class ControleurCompteGeneral  {
	

	private static Scanner sc = new Scanner(System.in);
	static CompteGeneral cmpt= new CompteGeneral();
	
	public static void creer() {
		
		Subdivise();
		Numero();
		Libelle();
		Position();
		System.out.println(Vue.AfficheCompteAvantConfirmer ());
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			//ListeComptesGenereau.addToList(numero, libelle, position, sub);
			System.out.println("le compte a �t� cr�� avec succ�s.");
	}

		}

	private static  void Subdivise() {
		System.out.println("Le compte doit-il �tre subdivis� (O/N) ? :");
		Character sub = sc.nextLine().charAt(0);

		while ((Character.toUpperCase(sub) != 'O') && (Character.toUpperCase(sub) != 'N')) {
			System.out.println("(O/N) ? :");
			sub = sc.nextLine().charAt(0);

		}
		if (sub == 'o' || sub == 'O') {
			cmpt.setSub(true);
		}
	}

	public static void Numero() {
		System.out.println("Quel est le num�ro du compte :");
		String numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
		}

		while (!(cmpt.isSub()) && numero.length() < 6) {
			numero = numero + "0";
		}
		cmpt.setNum(numero);
	}

	public static void Libelle() {
		System.out.println("Libell� :");
		String libelle = sc.nextLine();
		while (((libelle.equals(null) || libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]")))) {
			System.out.println("null, vide, caract�res invisible :");
			libelle = sc.nextLine();
		}
		cmpt.setLibelle(libelle);
	}

	public static void Position() {
		System.out.println("Position bilan�(A/B/C/D) :");
		char position = sc.nextLine().charAt(0);
		while ( !(Character.toString(position).matches("[A-D?]"))){
			System.out.println("Position bilan (a/b/c/d) :");
			 position = sc.nextLine().charAt(0);
		}
		cmpt.setPosition(position);
	}

}