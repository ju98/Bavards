import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class FenetreConnexion extends JFrame implements ActionListener {
	private JButton boutonConn = new JButton("Connexion");
	private JButton boutonAnnuler = new JButton("Annuler");
	private JLabel label = new JLabel("Nom du bavard");
	private JTextField corps = new JTextField("",10);
	private JPanel conteneur = new JPanel();
	
	public FenetreConnexion() {
		/*
		JFrame f = new JFrame();
		String nom = JOptionPane.showInputDialog(f,"Nom du bavard", "Connexion", JOptionPane.QUESTION_MESSAGE); //saisie information
		setNomBavard(nom);
		
		setVisible(true);
		*/
		
		
		super();
		setTitle("Connexion");
		setSize(250, 100);
		setLocationRelativeTo(null);
		
		boutonConn.addActionListener(this);  // ajout du bouton comme ecouteur
		boutonConn.setActionCommand("signIn");
		
		boutonAnnuler.addActionListener(this);
		boutonAnnuler.setActionCommand("close");
		
		conteneur.add(label, BorderLayout.SOUTH);
		conteneur.add(corps, BorderLayout.SOUTH);
		conteneur.add(boutonConn, BorderLayout.SOUTH);
		conteneur.add(boutonAnnuler, BorderLayout.SOUTH);
		setContentPane(conteneur);
		


		setVisible(true);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("signIn")){
				FenetreDialog fd = new FenetreDialog();
				
				Gestionnaire g = new Gestionnaire();
				String nomBavard = corps.getText();
				Bavard b1 = g.createNewBavard(nomBavard); // cree un nouveau bavard ayant le nom rentré dans la fenetre
				g.connectBavard(b1); // connecte le bavard b1
				
				fd.setBavard(b1);
			}
			
			if (e.getActionCommand().equals("close")) {
				// le bavard se deconnecte ?
				this.dispose(); //ferme la fenetre
			}
		}
	

	
	

}
