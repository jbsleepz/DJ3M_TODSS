package domein;

public class Bedrijf {
	private String naam;
	private String postadress;
	private String VestigingAdres;
	
	public Bedrijf(String nm,String pa,String va){
		setNaam(nm);
		setPostadress(pa);
		setVestigingAdres(va);
	}
	public void VoegContactpersoonToe(Cursist cursis){
				
	}
	public void VoegMedewerkerToe(Cursist cursis){
		
	}
	/**
	 * @return the naam
	 */
	public String getNaam() {
		return naam;
	}
	/**
	 * @param naam the naam to set
	 */
	public void setNaam(String naam) {
		this.naam = naam;
	}
	/**
	 * @return the postadress
	 */
	public String getPostadress() {
		return postadress;
	}
	/**
	 * @param postadress the postadress to set
	 */
	public void setPostadress(String postadress) {
		this.postadress = postadress;
	}
	/**
	 * @return the vestigingAdres
	 */
	public String getVestigingAdres() {
		return VestigingAdres;
	}
	/**
	 * @param vestigingAdres the vestigingAdres to set
	 */
	public void setVestigingAdres(String vestigingAdres) {
		VestigingAdres = vestigingAdres;
	}
}
