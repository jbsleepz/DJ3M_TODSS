package domein;

import java.util.List;

public class Cursist extends Persoon {
	private String chef;
	private int bedrijfsID;
	private List<CursusUitvoering> volgtCursussen;
	
	public Cursist() {
	}
	public String getFunctie() {
		return "Cursist";
	}
	public void setFunctie(String functie) {
		functie = "Cursist";
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
	public List<CursusUitvoering> getVolgtCursussen() {
		return volgtCursussen;
	}
	public void addCursusToCursist(CursusUitvoering cursus) {
		volgtCursussen.add(cursus);
	}
	public void removeCursusFromCursist(String uitvoeringID) {
		for(CursusUitvoering cursus : volgtCursussen){
			if (uitvoeringID == cursus.getUitvoeringID()){
				volgtCursussen.remove(uitvoeringID);
			}
			
		}
	}
}
