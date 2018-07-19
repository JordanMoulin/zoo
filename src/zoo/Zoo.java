package zoo;

public class Zoo {
	private String nom;
	private Zone savane;
	private Zone carnivore;
	private Zone aquarium;
	private Zone reptile;
	private Zone voliere;
	
	/** Constructeur avec paramètres */
	public Zoo(String zoo){
		this.nom=zoo;
		savane = new Zone("Savane Africaine");
		carnivore = new Zone("Paddock du Tyrannosaurus");
		aquarium = new Zone("Lac du Mosasaure");
		reptile = new Zone("Reptilo Land");
		voliere = new Zone("Volière");
	}
	
	/*public void addAnimaux(Animal... animal){
		for(int i=0;i<animal.length;i++){
			addAnimal(animal);
		}
	}*/
	public void addAnimal(Animal animal){
		if(animal.getRegime().equals("Carnivore")&&animal.getFamille().equals("Mammifère")){
			carnivore.addAnimal(animal);
		}else if(animal.getRegime().equals("Herbivore")&&animal.getFamille().equals("Mammifère")){
			savane.addAnimal(animal);
		}else if(animal.getFamille().equals("Reptile")){
			reptile.addAnimal(animal);
		}else if(animal.getFamille().equals("Poisson")){
			aquarium.addAnimal(animal);
		}else if(animal.getFamille().equals("Volatile")){
			voliere.addAnimal(animal);
		}
	}
	
	public void listerAnimaux(){
		savane.lister();
		carnivore.lister();
		aquarium.lister();
		reptile.lister();
		voliere.lister();
	}
	@Override
	public String toString() {
		return "Zoo [nom=" + nom + ", savane=" + savane + ", carnivore=" + carnivore + ", aquarium=" + aquarium
				+ ", reptile=" + reptile + ", voliere=" + voliere + "]";
	}

	/** Accesseurs */
	public String getNom() {
		return nom;
	}
	public Zone getSavane() {
		return savane;
	}
	public Zone getVoliere() {
		return voliere;
	}
	public Zone getCarnivore() {
		return carnivore;
	}
	public Zone getAquarium() {
		return aquarium;
	}
	public Zone getReptile() {
		return reptile;
	}
	
	/** Mutateurs */
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSavaneAfri(Zone savane) {
		this.savane = savane;
	}
	public void setCarnivore(Zone carnivore) {
		this.carnivore = carnivore;
	}
	public void setAquarium(Zone aquarium) {
		this.aquarium = aquarium;
	}
	public void setReptile(Zone reptile) {
		this.reptile = reptile;
	}
	public void setVoliere(Zone voliere) {
		this.voliere = voliere;
	}

}
