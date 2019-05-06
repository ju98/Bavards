import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreDialog extends JFrame implements ActionListener{
	private JButton boutonSend = new JButton("Envoyer");
	private JButton boutonDeconn = new JButton("Deconnexion");
	private JButton boutonNewb = new JButton("Nouveau bavard");
	private JLabel label = new JLabel("Message :");
	private JTextField corps = new JTextField("",80);
	private JPanel conteneur = new JPanel();
	
	private Bavard bavard;



	
	public FenetreDialog() {
		super();
		setTitle("Mon dialogue");
		setSize(1000, 400);
		setLocationRelativeTo(null);
		
		boutonSend.addActionListener(this);  // ajout du bouton comme ecouteur
		boutonSend.setActionCommand("generateEvent");
		
		boutonDeconn.addActionListener(this);
		boutonDeconn.setActionCommand("signOut");
		
		boutonNewb.addActionListener(this);
		boutonNewb.setActionCommand("newBavard");
		
		conteneur.add(label, BorderLayout.SOUTH);
		conteneur.add(corps, BorderLayout.SOUTH);
		conteneur.add(boutonSend, BorderLayout.SOUTH);
		conteneur.add(boutonDeconn, BorderLayout.SOUTH);
		conteneur.add(boutonNewb, BorderLayout.SOUTH);
		setContentPane(conteneur);
		


		setVisible(true);
				

	}
	
	
	public void actionPerformed(ActionEvent e) {
	//	Object source = e.getSource();
		
		
	//	if (source == boutonSend) {
		if (e.getActionCommand().equals("generateEvent")){
			String mess = corps.getText();
			
			bavard.generatePapotageEvent(null, mess); //envoie le mess au concierge
			
			JLabel l = new JLabel(mess);  //affiche le mess dans la fenetre
			conteneur.add(l, BorderLayout.SOUTH);
			setContentPane(conteneur);
			setVisible(true);
		}
		
		if (e.getActionCommand().equals("signOut")) {
			bavard.setConnecte(false); //deconnecte le bavard
			this.dispose(); //ferme la fenetre
		}
		
		if (e.getActionCommand().equals("newBavard")) {
			new FenetreConnexion();
			
		}
	}
	
	
	public void afficheMess(PapotageEvent mess) {
		JLabel l = new JLabel(mess.getCorps());  //affiche le mess dans la fenetre
		conteneur.add(l, BorderLayout.SOUTH);
		setContentPane(conteneur);
		setVisible(true);
	}

// getters et setters
	public Bavard getBavard() {
		return bavard;
	}


	public void setBavard(Bavard bavard) {
		this.bavard = bavard;
	}
	
	

}
