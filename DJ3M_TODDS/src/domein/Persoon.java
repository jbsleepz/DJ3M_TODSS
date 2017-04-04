package domein;

import java.util.Date;

public class Persoon {
	private String naam;
	private String email;
	private String wachtwoord;
	private Date geboortedatum;
	private String adres;
	
	public Persoon(String nm,String em,String ww,Date gb,String ad){
		naam = nm;
		email = em;
		wachtwoord = ww;
		geboortedatum = gb;
		adres = ad;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the wachtwoord
	 */
	public String getWachtwoord() {
		return wachtwoord;
	}
	/**
	 * @param wachtwoord the wachtwoord to set
	 */
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	/**
	 * @return the geboortedatum
	 */
	public Date getGeboortedatum() {
		return geboortedatum;
	}
	/**
	 * @param geboortedatum the geboortedatum to set
	 */
	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	/**
	 * @return the adres
	 */
	public String getAdres() {
		return adres;
	}
	/**
	 * @param adres the adres to set
	 */
	public void setAdres(String adres) {
		this.adres = adres;
	}
}
