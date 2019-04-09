import java.util.EventObject;

public class PapotageEvent extends EventObject {
	private String sujet;
	private String corps;
	
	public PapotageEvent(Object source, String sujet, String corps) {
		super(source);  //appel de l'unique constructeur de la classe mère
		this.sujet = sujet;
		this.corps = corps;
	}

	public String getSujet() {
		return sujet;
	}

	public String getCorps() {
		return corps;
	}


}
