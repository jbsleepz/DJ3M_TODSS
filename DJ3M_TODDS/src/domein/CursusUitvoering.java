package domein;

import java.util.Date;

public class CursusUitvoering extends Cursus{
	private String uitvoeringID;
	private Date beginDatum;
	private Date eindDatum;
	private int aantalPlaatsen;
	private Cursus cursus;
	private Docent cursist;
	public String getUitvoeringID() {
		return uitvoeringID;
	}
	public void setUitvoeringID(String uitvoeringID) {
		this.uitvoeringID = uitvoeringID;
	}
	public Date getBeginDatum() {
		return beginDatum;
	}
	public void setBeginDatum(Date beginDatum) {
		this.beginDatum = beginDatum;
	}
	public Date getEindDatum() {
		return eindDatum;
	}
	public void setEindDatum(Date eindDatum) {
		this.eindDatum = eindDatum;
	}
	public int getAantalPlaatsen() {
		return aantalPlaatsen;
	}
	public void setAantalPlaatsen(int aantalPlaatsen) {
		this.aantalPlaatsen = aantalPlaatsen;
	}
	public Cursus getCursus() {
		return cursus;
	}
	public void setCursus(Cursus cursus) {
		this.cursus = cursus;
	}
	public Docent getCursist() {
		return cursist;
	}
	public void setCursist(Docent cursist) {
		this.cursist = cursist;
	}
}
