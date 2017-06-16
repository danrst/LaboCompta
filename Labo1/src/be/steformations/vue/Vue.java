package be.steformations.vue;

import be.steformations.modele.CompteGeneral;

public class Vue {
	private static StringBuilder MenuPrincipale;
	private static StringBuilder MenuAfficher;
	
	public static String getScreen() {
		MenuPrincipale = new StringBuilder();
		MenuPrincipale.append(String.format("Menu logiciel comptable"));
	
		MenuPrincipale.append(String.format(System.lineSeparator()));
		MenuPrincipale.append(String.format("------------------------"));
		MenuPrincipale.append(String.format(System.lineSeparator()));
		MenuPrincipale.append(String.format("compte g�n�ral"));
		MenuPrincipale.append(String.format(System.lineSeparator()));
	
		MenuPrincipale.append(String.format("\t" + "1.Cr�er"));
		MenuPrincipale.append(String.format(System.lineSeparator()));;
		MenuPrincipale.append(String.format("\t" + "2.Modifier"));
		MenuPrincipale.append(String.format(System.lineSeparator()));
		MenuPrincipale.append(String.format("\t" + "3.Supprimer"));
		MenuPrincipale.append(String.format(System.lineSeparator()));
		MenuPrincipale.append(String.format("\t" + "4.Lister"));
		MenuPrincipale.append(String.format(System.lineSeparator()));
		MenuPrincipale.append(String.format("Entrez votre choix: "));
		return MenuPrincipale.toString();
	}
	public static String AfficheCompteAvantConfirmer (){
		MenuAfficher = new StringBuilder();
		MenuAfficher.append(String.format("Vos choix :"));
		MenuAfficher.append(String.format("Cr�ation d'un compte g�n�ral."));
		MenuAfficher.append(String.format("\t" + "Numero : " + CompteGeneral.numero));
		MenuAfficher.append(String.format("\t" + "Libell� : " + CompteGeneral.libelle));
		MenuAfficher.append(String.format("\t" + "Position dans le bilan : " + CompteGeneral.position));
		MenuAfficher.append(String.format("\t" + "subdivisible : " + CompteGeneral.sub));
		MenuAfficher.append(String.format("Confirmer (O/N) :"));
		return MenuAfficher.toString();
	}
}
