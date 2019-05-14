import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreDialog extends JFrame implements ActionListener{
	private JButton boutonSend = new JButton("Envoyer");
	private JButton boutonDeconn = new JButton("Deconnexion");
	
	private JTextField corps = new JTextField("",80);
	
	private JLabel discussion = new JLabel("<html><h3>Message :</h3></html>");
	private String fil_discussion = "";
	
	private JPanel conteneur = new JPanel();
	
	private Bavard bavard;


	
	public FenetreDialog() {
		super();
		
	// definit la taille et la position de la fenetre
		//setTitle("Fenetre dialogue");
		setSize(1000, 400);
		setLocationRelativeTo(null);
	
	// ajout des differents boutons comme ecouteur, avec des actions differentes
		boutonSend.addActionListener(this);
		boutonSend.setActionCommand("generateEvent");
		
		boutonDeconn.addActionListener(this);
		boutonDeconn.setActionCommand("signOut");
		
		
		conteneur.add(discussion);
		conteneur.add(corps, BorderLayout.AFTER_LAST_LINE);
		conteneur.add(boutonSend, BorderLayout.SOUTH);
		conteneur.add(boutonDeconn, BorderLayout.SOUTH);
		
		setContentPane(conteneur);
		
		//setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
	//	Object source = e.getSource();
		
	//si on appui sur le bouton envoyer
	//	if (source == boutonSend) {
		if (e.getActionCommand().equals("generateEvent")){ 
			String mess = corps.getText();
			bavard.generatePapotageEvent(bavard.getNom(), mess); //envoie le mess au concierge
		}
		
	//si on appui sur le bouton deconnexion
		if (e.getActionCommand().equals("signOut")) {
			FenetreConnexion.gestionnaire.deconnectBavard(bavard); //deconnecte le bavard
			this.dispose(); //ferme la fenetre
		}
	}
	
	
	public void afficheMess(PapotageEvent mess) {
		fil_discussion = fil_discussion + "<p>" + mess.getSujet()+" : "+mess.getCorps()+"</p>";
		discussion.setText("<html>" + fil_discussion + "<br><h3>Nouveau message :</h3></html>");
	}

	
	
// getters et setters
	public Bavard getBavard() {
		return bavard;
	}


	public void setBavard(Bavard bavard) {
		this.bavard = bavard;
	}
	
	

}
