package be.steformations.controle;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

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
		char confirme = collect();
		if (confirme == 'O') {
			if (!(listeCG.addToList(cmpt))) {
				System.out.println("le compte a �t� cr�� avec succ�s.");
			} else {
				System.out.println("d�sol� la ligne existe d�j� : ");
				listeCG.afficheLigne(cmpt);
			}

		}

	}

	private char collect() {
		Subdivise();
		Numero();
		Libelle();
		Position();
		vue.AfficheCompteAvantConfirmerCg(cmpt);
		System.out.println("Confirmer O/N ?");
		char confirme = sc.nextLine().charAt(0);
		return confirme;
	}

	public void modifier() {
		System.out.println("Quelle num�ro voulez-vous modifier ?");
		String numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
		}
		if (listeCG.getContainOuPas(numero)) {
			System.out.println("Vous aller modifier : ");
			listeCG.afficheLigne(cmpt);
			
			char confirme = collect();
			
			if (confirme == 'O') {
				listeCG.modifie(cmpt, numero);
			}

		} else {
			System.out.println("numero pas dedans");
		}

	}

	public void supprimer() {
		System.out.println("Quelle num�ro voulez-vous modifier ?");
		String numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
		}
		if (listeCG.getContainOuPas(numero)) {
			System.out.println("Vous aller suprimmer : ");
			listeCG.afficheLigne(cmpt);
			char confirme = sc.nextLine().charAt(0);
			if (confirme == 'O') {
				listeCG.supprime(numero);
			}
			}else
			{System.out.println("numero n'est pas dans la liste");
			}
		}

	

	public void lister() {
		Iterator<Entry<String, CompteGeneral>> it = listeCG.iterator();
		while (it.hasNext()) {
		 System.out.println(it.next());
		}

	}

	private void Subdivise() {
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

	public void Numero() {
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

	public void Libelle() {
		System.out.println("Libell� :");
		String libelle = sc.nextLine();
		while (((libelle.equals(null) || libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]")))) {
			System.out.println("null, vide, caract�res invisible :");
			libelle = sc.nextLine();
		}
		cmpt.setLibelle(libelle);
	}

	public void Position() {
		System.out.println("Position bilan�(A/B/C/D) :");
		char position = sc.nextLine().charAt(0);
		while (!(Character.toString(position).toUpperCase().matches("[A-D?]"))) {
			System.out.println("Position bilan (a/b/c/d) :");
			position = sc.nextLine().charAt(0);
		}
		cmpt.setPosition(position);
	}

}