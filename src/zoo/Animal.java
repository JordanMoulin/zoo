package zoo;

public class Animal {
	
	private String nom;
	private String type;
	
	/** Constructeur avec paramètres */
	public Animal(String nom, String type){
		this.nom=nom;
		this.type=type;
	}
	
	/** Mutateurs */
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setType(String type){
		this.type=type;
	}
	
	/** Accesseurs */
	public String getNom(){
		return nom;
	}
	public String getType(){
		return type;
	}
}
