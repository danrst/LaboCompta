package be.steformations.controle;

import java.util.Scanner;

import be.steformations.modele.CompteGeneral;
import be.steformations.vue.Vue;

public class Builder {

	private static int choix;

	static Scanner sc = new Scanner(System.in);

	public static void start() {
		System.out.println(Vue.getScreen());
		choix = Integer.parseInt(sc.nextLine());
		switch (choix) {
		case 1:
			CompteGeneral.Creer();
			break;
		case 2:
			CompteGeneral.modifier();
			break;
		case 3:
			CompteGeneral.supprimer();
			break;
		case 4:
			CompteGeneral.lister();
			break;
		case 5:
			//CompteParticulier.creer();
			break;
		case 6:
			//CompteParticulier.modifier();
			break;
		case 7:
			//CompteParticulier.supprimer();
			break;
		case 8:
			//CompteParticulier.lister();
			break;
		default:
		}

	}

}
