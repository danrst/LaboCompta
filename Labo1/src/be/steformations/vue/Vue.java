package be.steformations.vue;

public class Vue {
	public final int ETAT_COMPTE = 1;
	private int etat;
	
	public static String getScreen() {
		StringBuilder compteBuild;
		compteBuild = new StringBuilder();
		
		compteBuild.append(String.format("Menu logiciel comptable"));
	
		compteBuild.append(String.format(System.lineSeparator()));
		compteBuild.append(String.format("------------------------"));
		compteBuild.append(String.format(System.lineSeparator()));
		compteBuild.append(String.format("compte g�n�ral"));
		compteBuild.append(String.format(System.lineSeparator()));
	
		compteBuild.append(String.format(System.lineSeparator()));
		compteBuild.append(String.format("1.cr�er"));
		compteBuild.append(String.format(System.lineSeparator()));;
		compteBuild.append(String.format("2.Modifier"));
		compteBuild.append(String.format(System.lineSeparator()));
		compteBuild.append(String.format("3.Supprimer"));
		compteBuild.append(String.format(System.lineSeparator()));
		compteBuild.append(String.format("4.Lister"));
		compteBuild.append(String.format(System.lineSeparator()));
		compteBuild.append(String.format("votre r�ponse : "));
		return compteBuild.toString();
		
	}
}
