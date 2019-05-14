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
	
	public static Gestionnaire gestionnaire = null;
	

	public FenetreConnexion() {
		super();
		
		/*
		JFrame f = new JFrame();
		String nom = JOptionPane.showInputDialog(f,"Nom du bavard", "Connexion", JOptionPane.QUESTION_MESSAGE); //saisie information
		setNomBavard(nom);
		
		setVisible(true);
		*/
		
		setTitle("Connexion");
		setSize(250, 100);
		setLocationRelativeTo(null);
		
		// ajout des boutons comme ecouteurs
		boutonConn.addActionListener(this);  
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
				
				String nomBavard = corps.getText();
				Bavard b = gestionnaire.createNewBavard(nomBavard); // cree un nouveau bavard ayant le nom rentré dans la fenetre
				gestionnaire.connectBavard(b); // connecte le bavard b1
				
				
				this.dispose(); //ferme la fenetre de connexion

				FenetreDialog fd = new FenetreDialog();
				b.setFenetreDialog(fd);
				fd.setBavard(b);
				
				fd.setTitle("Fenetre dialogue de " + b.getNom());
				fd.setVisible(true);
			}
			
			if (e.getActionCommand().equals("close")) {
				this.dispose(); //ferme la fenetre
			}
		}



	

	
	

}
