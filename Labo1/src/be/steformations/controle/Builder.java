package be.steformations.controle;

import java.util.Scanner;
import be.steformations.vue.Vue;

public class Builder {
	int choixMenuG = 0;
	int choixMenuP = 0;
	char continuer = 'O';
	Scanner sc = new Scanner(System.in);
	Vue vue = new Vue();

	public void Start() {
		ControleurCompteGeneral ctrlCG = new ControleurCompteGeneral();
		while (Character.toUpperCase(continuer) == 'O') {
			vue.getScreenMenu();
			// ControleurCompteParticulier cptPart = new
			// ControleurCompteParticulier();

			int choix = Integer.parseInt(sc.nextLine());

			switch (choix) {
			case 1:
				vue.getScreenGeneral();
				choixMenuG = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				vue.getScreenParticulier();
				choixMenuP = Integer.parseInt(sc.nextLine());
				break;
			case 3:
				vue.getScreenEcriture();
				choixMenuP = Integer.parseInt(sc.nextLine());
				break;
			}

			switch (choixMenuG) {
			case 1:
				ctrlCG.creer();
				break;
			case 2:
				// CompteGeneral.modifier();
				break;
			}

			switch (choixMenuP) {
			case 1:
				// a remplir après
				break;
			case 2:
				// CompteParticuluer.modifier();
				break;

			}
			System.out.println("Continuer (O/N) ? :");
			continuer = sc.nextLine().charAt(0);

		}
		System.out.println("Dazvidaniya");

	}
}
