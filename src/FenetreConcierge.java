import java.awt.*;
import javax.swing.*;



public class FenetreConcierge extends JFrame  {
	private Concierge concierge;
	private JPanel conteneur = new JPanel();
	private JLabel label = new JLabel("<html><h1>Discussion :</h1></html>");
	private String discussion="<h1>Discussion :</h1>";
	
	
	
	public FenetreConcierge() {
		super();
	
	//definition du titre, de la taille et de la position de la fenetre
		setTitle("Fenetre du concierge");
		setSize(400, 900);
		setLocation(1450, 50);
		
		conteneur.add(label, BorderLayout.SOUTH);
		setContentPane(conteneur);

		setVisible(true);
		
	}
	
	
	public void afficheMess(PapotageEvent mess) {
		/*
		JLabel l = new JLabel("<html><h3>" + mess.getSujet()+"</h3><p>"+mess.getCorps()+"</p></html>");
		conteneur.add(l, BorderLayout.SOUTH);
		setContentPane(conteneur);
		setVisible(true);
		*/
		
		discussion = discussion + "<p>" + mess.getSujet()+" : "+mess.getCorps()+"</p>";
		label.setText("<html>" + discussion + "</html>");
	}
	


//getters et setters
	public Concierge getConcierge() {
		return concierge;
	}


	public void setConcierge(Concierge concierge) {
		this.concierge = concierge;
	}
}
