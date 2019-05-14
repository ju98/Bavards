
public class Main {
	
	public static void main (String[] args){
		
		//creation du gestionnaire qui est commun à toute les classes
		Gestionnaire g = new Gestionnaire();
		
		FenetreConnexion.gestionnaire = g;

		//ouverture de la fenetre du concierge 
		FenetreConcierge fc = new FenetreConcierge();
		fc.setGestionnaire(g);
		fc.setConcierge(g.getConcierge());
		g.getConcierge().setConciergeGUI(fc);
		

		
		
	}

}
