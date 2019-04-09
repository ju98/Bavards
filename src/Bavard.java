import java.util.ArrayList;


public class Bavard implements PapotageListener{
	private String nom;
	private boolean connecte = false;
	ArrayList<PapotageListener> ecouteurs = new ArrayList<PapotageListener>(); 
	
	public Bavard(String nom) {
		super();
		this.nom = nom;
	}
	
	
	
	public boolean isConnecte() {
		return connecte;
	}

	public void setConnecte(boolean connecte) {
		this.connecte = connecte;
	}
	
	
	
// ajouter et supprimer des ecouteurs
	public void addPapotageListener(PapotageListener ecouteur) {
		ecouteurs.add(ecouteur);
	}
	


	public void removePapotageListener(PapotageListener ecouteur) {
		ecouteurs.remove(ecouteur);
	}
	

// generer des evenements (= des nouveaux messages)
	public void generatePapotageEvent(String sujet, String corps) {
		PapotageEvent mess = new PapotageEvent(this, sujet, corps);
		
		for (PapotageListener elem:ecouteurs) {
			elem.newPapotage(mess);
		}
	}

	@Override
	public void newPapotage(PapotageEvent mess) {
		// TODO Auto-generated method stub
		
	}


}