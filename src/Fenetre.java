import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Fenetre extends JOptionPane{
	private String nomBavard = null;
	
	public Fenetre() {
		JFrame f = new JFrame();
		String nom = JOptionPane.showInputDialog(f,"Nom du bavard", "Connexion", JOptionPane.QUESTION_MESSAGE); //saisie information
		setNomBavard(nom);
		
		setVisible(true);
	}

	public String getNomBavard() {
		return nomBavard;
	}

	public void setNomBavard(String nomBavard) {
		this.nomBavard = nomBavard;
	}
	
	

}
