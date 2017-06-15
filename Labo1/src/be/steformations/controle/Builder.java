package be.steformations.controle;


import java.util.Scanner;

import be.steformations.modele.Compte;
import be.steformations.modele.CompteGeneral;
import be.steformations.modele.ListeComptesGenereau;
import be.steformations.vue.Vue;


public class Builder {

	private static int choix;

	static Scanner sc = new Scanner(System.in);

	public static void start() {
		System.out.println(Vue.getScreen());
		choix = Integer.parseInt(sc.nextLine());
		switch (choix) {
		case 1:
			CompteGeneral.creer();
			break;
		default:
		}

	}

	

	}


