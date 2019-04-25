
public class Main {
	
	public static void main (String[] args){

		
		
		Fenetre f = new Fenetre();
		FenetreDialog fd = new FenetreDialog();
//		Dialog d = new Dialog(fd, "Mon dialogue", true);
		
		Gestionnaire g = new Gestionnaire();
		String nomBavard = f.getNomBavard();
		Bavard b1 = g.createNewBavard(nomBavard); // cree un nouveau bavard ayant le nom rentré dans la fenetre
		g.connectBavard(b1); // connecte le bavard b1

		

		
		
	}

}
