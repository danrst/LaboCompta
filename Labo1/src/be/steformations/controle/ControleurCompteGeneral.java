package be.steformations.controle;

import java.util.Scanner;

import be.steformations.modele.CompteGeneral;
import be.steformations.modele.ListeComptesGenereau;
import be.steformations.vue.Vue;

public class ControleurCompteGeneral {

	private Scanner sc = new Scanner(System.in);
	private CompteGeneral cmpt;
	private Vue vue = new Vue();
	private ListeComptesGenereau listeCG = new ListeComptesGenereau();

	public void creer() {
		cmpt = new CompteGeneral();
		Subdivise();
		Numero();
		Libelle();
		Position();
		System.out.println(vue.AfficheCompteAvantConfirmer(cmpt));
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			if (!(listeCG.addToList(cmpt))) {
				System.out.println("le compte a été créé avec succès.");
			} else {
				System.out.println("désolé");

			}

		}

	}

	private void Subdivise() {
		System.out.println("Le compte doit-il être subdivisé (O/N) ? :");
		Character sub = sc.nextLine().charAt(0);

		while ((Character.toUpperCase(sub) != 'O') && (Character.toUpperCase(sub) != 'N')) {
			System.out.println("(O/N) ? :");
			sub = sc.nextLine().charAt(0);

		}
		if (sub == 'o' || sub == 'O') {
			cmpt.setSub(true);
		}
	}

	public void Numero() {
		System.out.println("Quel est le numéro du compte :");
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

	public void Libelle() {
		System.out.println("Libellé :");
		String libelle = sc.nextLine();
		while (((libelle.equals(null) || libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]")))) {
			System.out.println("null, vide, caractères invisible :");
			libelle = sc.nextLine();
		}
		cmpt.setLibelle(libelle);
	}

	public void Position() {
		System.out.println("Position bilan (A/B/C/D) :");
		char position = sc.nextLine().charAt(0);
		while (!(Character.toString(position).matches("[A-D?]"))) {
			System.out.println("Position bilan (a/b/c/d) :");
			position = sc.nextLine().charAt(0);
		}
		cmpt.setPosition(position);
	}

}