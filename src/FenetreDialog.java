import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class FenetreDialog extends JFrame {
	private JButton b = new JButton("Envoyer");
	private ArrayList<JButton> ecouteurs = new  ArrayList<JButton>();
	private JLabel label = new JLabel("Message :");
	private JTextField corps = new JTextField("ton message...");
	
	private JPanel conteneur = new JPanel();
	
	private String mess;


	
	public FenetreDialog() {
		super();
		setTitle("Mon dialogue");
		setSize(800, 400);
		setLocationRelativeTo(null);
		
		
		conteneur.add(label, BorderLayout.SOUTH);
		conteneur.add(corps, BorderLayout.SOUTH);
		conteneur.add(b, BorderLayout.SOUTH);
		setContentPane(conteneur);
		
		String mess = corps.getText();
		setMess(mess);
		
		setVisible(true);
				
//		b.addActionListener(ecouteurs);  // ajout du bouton comme ecouteur

	}
	
	
	public void actionPerformed(PapotageEvent arg0) {
		//label.setText(message);
	}
	
	
	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}


}
