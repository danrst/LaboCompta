package be.steformations.vue;

import be.steformations.modele.CompteGeneral;

public class Vue {
	private static StringBuilder menu;
	
	public static String getScreen() {
		menu = new StringBuilder();
		menu.append(String.format("Menu logiciel comptable"));
	
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("------------------------"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("compte général"));
		menu.append(String.format(System.lineSeparator()));
	
		menu.append(String.format("\t" + "1.Créer"));
		menu.append(String.format(System.lineSeparator()));;
		menu.append(String.format("\t" + "2.Modifier"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "3.Supprimer"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "4.Lister"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Entrez votre choix: "));
		return menu.toString();
	}

	public String AfficheCompteAvantConfirmer (CompteGeneral pCmptG){
		menu = new StringBuilder();
		menu.append(String.format("Vos choix :"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Création d'un compte général."));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "Numero : " + pCmptG.getNum()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "Libellé : " + pCmptG.getLibelle()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "Position dans le bilan : " + pCmptG.getPosition()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "subdivisible : " + pCmptG.isSub()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Confirmer (O/N) :"));
		return menu.toString();
	}
}
