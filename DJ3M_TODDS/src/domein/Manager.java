package domein;

public class Manager extends Persoon {
	private String chef;
	private int bedrijfsID;
	
	public Manager() {
	}
	public String getFunctie() {
		return "Manager";
	}
	public void setFunctie(String functie) {
		functie = "Manager";
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	public int getBedrijfsID() {
		return bedrijfsID;
	}
	public void setBedrijfsID(int bedrijfsID) {
		this.bedrijfsID = bedrijfsID;
	}
}
