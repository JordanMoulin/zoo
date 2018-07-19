package zoo;

public class Zone {
	private String nom;
	private Animal[] animaux;
	private Animal[] tempA;
	private int i;

	/** Constructeur avec paramètres */
	public Zone(String nom){
		this.nom=nom;
		animaux=new Animal[0];
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

	public void lister() {
		System.out.println("Zone : "+getNom()+", liste :");
		for(Animal an:animaux){
			System.out.println("\t"+an);
		}
	}
	@Override
	public String toString() {
		String chaine="";
		for(int i=0;i<animaux.length;i++){
			chaine+=animaux[i];
		}
		return chaine;
	}

	/** Accesseurs */
	public String getNom() {
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
}
