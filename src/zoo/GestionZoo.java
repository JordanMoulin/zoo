package zoo;

public class GestionZoo {

	public static void main(String[] args) {
		Zoo jurassic = new Zoo("Jurassic park");
		jurassic.addAnimal(new Mammifere("Rexy","Tyrannosaurus","Carnivore"));
		jurassic.addAnimal(new Mammifere("Blue","Velociraptor","Carnivore"));
		jurassic.addAnimal(new Poisson("Blop","Poisson Clown","Piscivore"));
		jurassic.addAnimal(new Reptile("Hector","Crocodile","Carnivore"));
		jurassic.addAnimal(new Volatile("Pteri","Pterodactyle","Piscivore"));
		
		jurassic.addAnimal(new Mammifere("Simba","Lion","Carnivore"));
		jurassic.addAnimal(new Mammifere("Pteri","Lion","Carnivore"));
		jurassic.addAnimal(new Mammifere("Gaza","Gazelle","Herbivore"));
		jurassic.addAnimal(new Mammifere("Hope","Antilope","Herbivore"));
		jurassic.addAnimal(new Mammifere("Zoro","Zèbre","Herbivore"));
		jurassic.addAnimal(new Poisson("Lex","Requin","Carnivore"));
		jurassic.addAnimal(new Poisson("Ana","Morue","Piscivore"));
		jurassic.addAnimal(new Reptile("Lilo","Anaconda","Carnivore"));
		jurassic.addAnimal(new Reptile("Flora","Boa","Carnivore"));
		
		/*System.out.println(jurassic.getCarnivore().getAnimaux().length);
		System.out.println(jurassic.getCarnivore());
		System.out.println(jurassic.getVoliere());
		System.out.println(jurassic.getAquarium());*/
		
		jurassic.listerAnimaux();
	}
}
