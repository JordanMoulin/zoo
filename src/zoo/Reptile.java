package zoo;

public class Reptile extends Animal {
private String categorie;
	
	public Reptile(String nom, String type, String regime){
		super(nom,type,regime);
		this.categorie="Reptile";
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
