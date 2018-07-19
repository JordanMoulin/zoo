package zoo;

public abstract class Animal {
	
	private String nom;
	private String type;
	private String regime;
	
	/** Constructeur par défaut */
	
	/** Constructeur avec paramètres */
	public Animal(String nom, String type, String regime){
		this.nom=nom;
		this.type=type;
		this.regime=regime;
	}
	
	public abstract String getFamille();
	@Override
	public String toString() {
		return nom + ", type = " + type + ", regime = " + regime;
	}

	/** Mutateurs */
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setType(String type){
		this.type=type;
	}
	public void setRegime(String regime){
		this.regime=regime;
	}
	
	/** Accesseurs */
	public String getNom(){
		return nom;
	}
	public String getType(){
		return type;
	}
	public String getRegime(){
		return regime;
	}
}
