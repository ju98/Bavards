/* Gere les bavards */

import java.util.ArrayList;


public class Gestionnaire {
	private Concierge concierge = new Concierge();
	private ArrayList<Bavard> bavards = new ArrayList<Bavard>();
	
	public void addBavard(Bavard b) {
		bavards.add(b);
	}
	
	public void removeBavard(Bavard b) {
		bavards.remove(b);
	}

// cree un nouveau bavard (avec comme listener le concierge), et l'ajoute a la liste des bavards
	public Bavard createNewBavard(String nom) {
		Bavard bavard = new Bavard(nom);
		bavard.addPapotageListener(concierge);
		addBavard(bavard);
		return bavard;
		
	}

// connecte un bavard, et l'ajoute aux ecouteurs du concierge afin de recevoir les messages
	public void connectBavard(Bavard b) {
		b.setConnecte(true);
		concierge.addPapotageListener(b);
	}

// deconnecte un bavard, et le retire des ecouteurs du concierge
	public void deconnectBavard(Bavard b) {
		b.setConnecte(false);
		concierge.removePapotageListener(b);
	}
}
