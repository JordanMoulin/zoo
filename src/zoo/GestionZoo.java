package zoo;

public class GestionZoo {

	public static void main(String[] args) {
		Zoo jurassic = new Zoo("Jurassic park");
		jurassic.getCarnivore().addAnimal(new Animal("Rexy","Tyrannosaurus"));
		jurassic.getCarnivore().addAnimal(new Animal("Blue","Velociraptor"));
		
		System.out.println(jurassic.getCarnivore().getAnimaux().length);
	}

}
