import java.awt.BorderLayout;
import javax.swing.*;



public class FenetreConcierge extends JFrame  {
	private Concierge concierge;
	private JPanel conteneur = new JPanel();
	
	public FenetreConcierge() {
		super();
		setTitle("Concierge");
		setSize(400, 900);
		//setLocationRelativeTo(null);
		setLocation(1450, 50);
		
		JLabel label = new JLabel("Discussion :");
		conteneur.add(label, BorderLayout.SOUTH);
		setContentPane(conteneur);


		setVisible(true);
		
	}
	
	
	public void afficheMess(PapotageEvent mess) {
		
		JLabel l = new JLabel(mess.getSujet()+" : "+mess.getCorps());
		conteneur.add(l, BorderLayout.SOUTH);
		setContentPane(conteneur);
		setVisible(true);
		

		
		//concierge.transmitPapotageEvent(mess);
		
	}
	

	public Concierge getConcierge() {
		return concierge;
	}


	public void setConcierge(Concierge concierge) {
		this.concierge = concierge;
	}
}
