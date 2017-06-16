package be.steformations.modele;

import java.util.Scanner;
import be.steformations.vue.Vue;

public class CompteGeneral extends Compte {

	static Scanner sc = new Scanner(System.in);

	public static boolean sub = false;
	public static String numero = "";
	public static String libelle = "";
	public static Character position = ' ';

	public static void Creer() {

		Subdivise();
		Numero();
		Libelle();
		Position();
		System.out.println("je passe par ici ? ");
		Vue.AfficheCompteAvantConfirmer();
		System.out.println("je passe par ici  après afficher? ");

		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			ListeComptesGenereau.addToList(numero, libelle, position, sub);
			System.out.println("le compte a été créé.");

		}
	}

	public static void Position() {
		System.out.println("Position bilan (A/B/C/D) :");
		position = sc.nextLine().charAt(0);
		/*while ((Character.toUpperCase(position) == 'A') && (Character.toUpperCase(position) == 'B')
				&& (Character.toUpperCase(position) == 'C') && (Character.toUpperCase(position) == 'D')) {
			System.out.println("(A/B/C/D) :");
			position = sc.nextLine().charAt(0);
		}*/
	}

	public static void Libelle() {
		System.out.println("Libellé :");
		libelle = sc.nextLine();
		while (((libelle.equals(null) || libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]")))) {
			System.out.println("null, vide, caractères invisible :");
			libelle = sc.nextLine();
		}
	}

	public static void Numero() {
		System.out.println("Quel est le numéro du compte :");
		numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
		}

		while (!sub && numero.length() < 6) {
			numero = numero + "0";
		}
	}

	public static void Subdivise() {
		System.out.println("Le compte doit-il être subdivisé (O/N) ? :");
		Character tmp = sc.nextLine().charAt(0);

		while (!((Character.toUpperCase(tmp) == 'O') || (Character.toUpperCase(tmp) == 'N'))) {
			System.out.println("(O/N) ? :");
			tmp = sc.nextLine().charAt(0);

		}
		if (tmp == 'o' || tmp == 'O') {
			sub = true;
		}
	}

	public static void modifier() {
		// TODO Auto-generated method stub

	}

	public static void supprimer() {
		// TODO Auto-generated method stub

	}

	public static void lister() {
		// TODO Auto-generated method stub

	}
}
