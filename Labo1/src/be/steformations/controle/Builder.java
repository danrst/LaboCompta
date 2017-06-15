package be.steformations.controle;

import java.util.HashMap;
import java.util.Scanner;

import be.steformations.modele.General;
import be.steformations.vue.Vue;
import serialisation.Exemple;

public class Builder {
	private static int choix;
	private static char sub = ' ';
	private static String numero = "";
	char position = ' ';
	


	private static General cmptg;
	static Scanner sc = new Scanner(System.in);

	public static void start() {
		System.out.println(Vue.getScreen());
		choix= Integer.parseInt(sc.nextLine());
		switch (choix) {
		case 1:
			creerCompteG();
			break;
		default:
		}

	}

	private static void creerCompteG() {
		 
		cmptg = new General();
		
		System.out.println("Compte subdivisé (Oui/Nnon) ? :");
		
		 sub = sc.nextLine().charAt(0);
		
		if (sub == 'O'){
			cmptg.setValid(true);
		}else { cmptg.setValid(false);
		}

		System.out.println("Numéro du compte :");
		numero = sc.nextLine();
		// if is valide
		cmptg.setNumero(numero);

		System.out.println("Libellé :");
		String libelle = sc.nextLine();
		// if is valide
		cmptg.setLibelle(libelle);

		System.out.println("Position bilan (a/b/c/d) :");
		char position = sc.nextLine().charAt(0);
		// if is valide
		cmptg.setPosition(position);

		System.out.println("Vos choix :");
		System.out.println("Création d'un compte général.");
		System.out.println("\t" + "Numero : " + numero);
		System.out.println("\t" + "Libellé : " + libelle);
		System.out.println("\t" + "Position dans le bilan : " + position);
		System.out.println("\t" + "subdivisible : " + sub);
		System.out.println("Confirmer (O/N) :");
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O'){
			System.out.println("le compte a été créé.");
			cmptg.addToList();
		}
		
		

	}

}
