import java.util.ArrayList;


public class Bavard implements PapotageListener{
	private String nom;
	private boolean connecte = false;
	private FenetreDialog fenetreDialog = null;
	private ArrayList<PapotageListener> ecouteurs = new ArrayList<PapotageListener>(); 
	
		
	
	public Bavard(String nom) {
		super();
		this.nom = nom;
	}
	
	
// getters et setters	
	public boolean isConnecte() {
		return connecte;
	}

	public void setConnecte(boolean connecte) {
		this.connecte = connecte;
	}
	
	public FenetreDialog getFenetreDialog() {
		return fenetreDialog;
	}

	public void setFenetreDialog(FenetreDialog fenetreDialog) {
		this.fenetreDialog = fenetreDialog;
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
		fenetreDialog.afficheMess(mess);
		
	}


}
