import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreDialog extends JFrame implements ActionListener{
	private JButton boutonSend = new JButton("Envoyer");
	private JButton boutonDeconn = new JButton("Deconnexion");
//	private ArrayList<JButton> ecouteurs = new  ArrayList<JButton>();
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
		
		conteneur.add(label, BorderLayout.SOUTH);
		conteneur.add(corps, BorderLayout.SOUTH);
		conteneur.add(boutonSend, BorderLayout.SOUTH);
		conteneur.add(boutonDeconn, BorderLayout.SOUTH);
		setContentPane(conteneur);
		


		setVisible(true);
				

	}
	
	
	public void actionPerformed(ActionEvent e) {
	//	Object source = e.getSource();
		
		
	//	if (source == boutonSend) {
		if (e.getActionCommand().equals("generateEvent")){
			String mess = corps.getText();
			bavard.generatePapotageEvent(null, mess);
			JLabel l = new JLabel(mess);
			conteneur.add(l, BorderLayout.SOUTH);
			setContentPane(conteneur);
			setVisible(true);
		}
		
		if (e.getActionCommand().equals("signOut")) {
			// le bavard se deconnecte ?
			this.dispose(); //ferme la fenetre
		}
	}
	

// getters et setters
	public Bavard getBavard() {
		return bavard;
	}


	public void setBavard(Bavard bavard) {
		this.bavard = bavard;
	}
	
	

}
