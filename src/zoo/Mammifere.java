package zoo;

public class Mammifere extends Animal {
	private String categorie;
	
	public Mammifere(String nom, String type, String regime){
		super(nom,type,regime);
		this.categorie="Mammifère";
	}
	
	public String getFamille(){
		return categorie;
	}
//	@Override
//	public String toString() {
//		String detail = super.toString();
//		return detail+" categorie=" + categorie + "]";
//	}
	
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
}