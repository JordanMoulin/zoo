package zoo;

public class Zone {
	private String nom;
	private Animal[] animaux;
	private Animal[] tempA;
	private int compteur;
	private int i;

	/** Constructeur avec paramètres */
	public Zone(String nom){
		this.nom=nom;
		animaux=new Animal[0];
	}
	
	/** Accesseurs */
	public String nom() {
		return nom;
	}
	public Animal[] getAnimaux() {
		return animaux;
	}

	/** Mutateurs */
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAnimaux(Animal animaux[]) {
		this.animaux = animaux;
	}
	
	/** Méthodes */
	public void addAnimal(Animal animal){
		tempA= new Animal[animaux.length+1];
		for(i=0;i<animaux.length;i++){
			tempA[i] = animaux[i];
		}
		tempA[animaux.length]= animal;
		animaux = new Animal[tempA.length];
		for(i=0;i<tempA.length;i++){
			animaux[i]= tempA[i];
		}
	}
	public int getNombre(){
		return compteur;
	}
}
