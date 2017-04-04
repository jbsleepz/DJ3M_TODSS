package domein;

import java.util.List;

public class Cursus {
	private String CursusCode;
	private String Omschrijving;
	private int AantalPlaatsen;
	private double CursusPrijs;
	private List<Training> training;
	
	public Cursus(String cc,String om,int ap,double cp){
		CursusCode = cc;
		Omschrijving = om;
		AantalPlaatsen = ap;
	}
	public void VoegTrainingToeAanCursus(Training T){
		training.add(T);
		//maak uniek
	}
	/**
	 * @return the cursusCode
	 */
	public String getCursusCode() {
		return CursusCode;
	}
	/**
	 * @param cursusCode the cursusCode to set
	 */
	public void setCursusCode(String cursusCode) {
		CursusCode = cursusCode;
	}
	/**
	 * @return the omschrijving
	 */
	public String getOmschrijving() {
		return Omschrijving;
	}
	/**
	 * @param omschrijving the omschrijving to set
	 */
	public void setOmschrijving(String omschrijving) {
		Omschrijving = omschrijving;
	}
	/**
	 * @return the aantalPlaatsen
	 */
	public int getAantalPlaatsen() {
		return AantalPlaatsen;
	}
	/**
	 * @param aantalPlaatsen the aantalPlaatsen to set
	 */
	public void setAantalPlaatsen(int aantalPlaatsen) {
		AantalPlaatsen = aantalPlaatsen;
	}
	/**
	 * @return the cursusPrijs
	 */
	public double getCursusPrijs() {
		return CursusPrijs;
	}
	/**
	 * @param cursusPrijs the cursusPrijs to set
	 */
	public void setCursusPrijs(double cursusPrijs) {
		CursusPrijs = cursusPrijs;
	}
	
	
}
