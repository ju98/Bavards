
public class Main {
	
	public static void main (String[] args){
		
		Gestionnaire g = new Gestionnaire();
		FenetreConnexion.gestionnaire = g;
		
		new FenetreConnexion();

		
		FenetreConcierge fc = new FenetreConcierge();
		fc.setConcierge(g.getConcierge());
		g.getConcierge().setConciergeGUI(fc);
		

		
		
	}

}
