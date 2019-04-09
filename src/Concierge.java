/* Fait transiter les messages des bavards */

import java.util.ArrayList;


public class Concierge implements PapotageListener{
	private ArrayList<PapotageListener> ecouteurs = new  ArrayList<PapotageListener>(); // Tous les ecouteurs du concierge
	

	
// ajouter ou supprimer des ecouteurs 
	public void addPapotageListener(PapotageListener ecouteur) {
		ecouteurs.add(ecouteur);
	}
	
	public void removePapotageListener(PapotageListener ecouteur) {
		ecouteurs.remove(ecouteur);
	}

	
// le concierge transmet l'event (le message)
	public void transmitPapotageEvent(PapotageEvent mess) {
		
		for (PapotageListener elem:ecouteurs) {
			elem.newPapotage(mess);
		}
	}

	@Override
	public void newPapotage(PapotageEvent mess) {
		transmitPapotageEvent(mess);
		
	}
	

}
