package be.steformations.modele;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CompteGeneral extends Compte {

	static Scanner sc = new Scanner(System.in);

	private static boolean sub = false;
	private static String numero = "";
	char position = ' ';

	public static void creer() {

		System.out.println("Compte subdivisé (O/N) ? :");
		Character tmp = sc.nextLine().charAt(0);

		while (!((Character.toUpperCase(tmp) == 'O') || (Character.toUpperCase(tmp) == 'N'))) {
			System.out.println("(O/N) ? :");
			tmp = sc.nextLine().charAt(0);

		}
		if (tmp == 'o' || tmp == 'O') {
			sub = true;
		}

		System.out.println("Numéro du compte :");
		numero = sc.nextLine();
		while (!(numero.matches("[0-9]+")) && (numero.length() <= 6 || numero.length() > 0)) {
			System.out.println("Uniquement [0-9] et pas plus de 6 :");
			numero = sc.nextLine();
		}

		while (!sub && numero.length() < 6) {
			numero = numero + "0";
		}

		System.out.println("Libellé :");
		String libelle = sc.nextLine();
		// il laisse passer les espaces et tab
		while ((libelle.length() < 0) || (libelle.equals(null) || (libelle.isEmpty()))) {
			System.out.println("null, vide, caractères invisible :");
			libelle = sc.nextLine();
		}

		System.out.println("Position bilan (a/b/c/d) :");
		char position = sc.nextLine().charAt(0);

		System.out.println("Vos choix :");
		System.out.println("Création d'un compte général.");
		System.out.println("\t" + "Numero : " + numero);
		System.out.println("\t" + "Libellé : " + libelle);
		System.out.println("\t" + "Position dans le bilan : " + position);
		System.out.println("\t" + "subdivisible : " + sub);
		System.out.println("Confirmer (O/N) :");
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			ListeComptesGenereau.addToList(numero, libelle, position, sub);
			System.out.println("le compte a été créé.");

		}
	}
}
