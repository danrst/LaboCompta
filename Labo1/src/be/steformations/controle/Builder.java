package be.steformations.controle;

import java.util.Scanner;

import be.steformations.modele.General;
import be.steformations.vue.Vue;

public class Builder {
	private static int choixInt;
	
	private static General cmptg;
	static Scanner sc = new Scanner(System.in);
	static Scanner fuck = new Scanner(System.in);
	public static void start() {
		System.out.println(Vue.getScreen());
		newIput();
		switch (choixInt) {
		case 1:
			newCompteGeneral();
			break;
		default:
		}

	}

	private static void newIput() {
		choixInt = sc.nextInt();
	}

	private static void newCompteGeneral() {
		cmptg = new General();
		System.out.println("Compte subdivisé (O/N) ? :");
		String str = fuck.nextLine();
		if (str.equals("O")) {
			cmptg.setValid(true);
		}
		
		System.out.println("Numéro du compte :");
		String str1 = fuck.nextLine();
		// if is valide 
		cmptg.setNumero(str1);
		
		System.out.println("Libellé :");
		String str2 = fuck.nextLine();
		// if is valide 
		cmptg.setLibelle(str2);
		
		System.out.println("Position bilan (a/b/c/d) :");
		char str4 = fuck.next().charAt(0);
		// if is valide 
		cmptg.setPosition(str4);
		
		System.out.println("Vos choix :");
		System.out.println("Création d'un compte général.");
		
		
		
		
	
		

	}
}
