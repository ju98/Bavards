import javax.swing.JDialog;
import javax.swing.JFrame;



public class Dialog extends JDialog {
	
	public Dialog(JFrame fenetre, String titre, boolean modal) {
		super(fenetre, titre, modal); // appel du constructeur de JDialog correspondant
		this.setSize(800, 400); // definit la taille
		this.setLocationRelativeTo(null); // definit la position;
		
		
		this.setVisible(true); // affiche la boite de dialogue
		
		
	}
	
	

}
