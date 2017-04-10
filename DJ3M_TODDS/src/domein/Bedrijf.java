package domein;

import java.util.ArrayList;
import java.util.List;

public class Bedrijf {
	private String bedrijfsID;
	private String bedrijfsnaam;
	private String vestiging_naam;
	private int vestiging_huisnummer;
	private String vestiging_toevoeging;
	private String vestiging_postcode;
	private String vestiging_plaats;
	private int vestiging_postbus;
	private String postadres_naam;
	private int postadres_huisnummer;
	private String postadres_toevoeging;
	private String postadres_postcode;
	private String postadres_plaats;
	private int postadres_postbus;
	private int telefoonnummer;
	private int kvknummer;
	private String email;
	private List<Manager> managers = new ArrayList<Manager>();
	private List<Cursist> cursisten = new ArrayList<Cursist>();
	
	public Bedrijf(){
		
	}
	public String getBedrijfsID() {
		return bedrijfsID;
	}
	public void setBedrijfsID(String bedrijfsID) {
		this.bedrijfsID = bedrijfsID;
	}
	public String getBedrijfsnaam() {
		return bedrijfsnaam;
	}
	public void setBedrijfsnaam(String bedrijfsnaam) {
		this.bedrijfsnaam = bedrijfsnaam;
	}
	public String getVestiging_naam() {
		return vestiging_naam;
	}
	public void setVestiging_naam(String vestiging_naam) {
		this.vestiging_naam = vestiging_naam;
	}
	public int getVestiging_huisnummer() {
		return vestiging_huisnummer;
	}
	public void setVestiging_huisnummer(int vestiging_huisnummer) {
		this.vestiging_huisnummer = vestiging_huisnummer;
	}
	public String getVestiging_toevoeging() {
		return vestiging_toevoeging;
	}
	public void setVestiging_toevoeging(String vestiging_toevoeging) {
		this.vestiging_toevoeging = vestiging_toevoeging;
	}
	public String getVestiging_postcode() {
		return vestiging_postcode;
	}
	public void setVestiging_postcode(String vestiging_postcode) {
		this.vestiging_postcode = vestiging_postcode;
	}
	public String getVestiging_plaats() {
		return vestiging_plaats;
	}
	public void setVestiging_plaats(String vestiging_plaats) {
		this.vestiging_plaats = vestiging_plaats;
	}
	public int getVestiging_postbus() {
		return vestiging_postbus;
	}
	public void setVestiging_postbus(int vestiging_postbus) {
		this.vestiging_postbus = vestiging_postbus;
	}
	public String getPostadres_naam() {
		return postadres_naam;
	}
	public void setPostadres_naam(String postadres_naam) {
		this.postadres_naam = postadres_naam;
	}
	public int getPostadres_huisnummer() {
		return postadres_huisnummer;
	}
	public void setPostadres_huisnummer(int postadres_huisnummer) {
		this.postadres_huisnummer = postadres_huisnummer;
	}
	public String getPostadres_toevoeging() {
		return postadres_toevoeging;
	}
	public void setPostadres_toevoeging(String postadres_toevoeging) {
		this.postadres_toevoeging = postadres_toevoeging;
	}
	public String getPostadres_postcode() {
		return postadres_postcode;
	}
	public void setPostadres_postcode(String postadres_postcode) {
		this.postadres_postcode = postadres_postcode;
	}
	public String getPostadres_plaats() {
		return postadres_plaats;
	}
	public void setPostadres_plaats(String postadres_plaats) {
		this.postadres_plaats = postadres_plaats;
	}
	public int getPostadres_postbus() {
		return postadres_postbus;
	}
	public void setPostadres_postbus(int postadres_postbus) {
		this.postadres_postbus = postadres_postbus;
	}
	public int getTelefoonnummer() {
		return telefoonnummer;
	}
	public void setTelefoonnummer(int telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public int getKvknummer() {
		return kvknummer;
	}
	public void setKvknummer(int kvknummer) {
		this.kvknummer = kvknummer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Manager> getManagers(){
		return managers;
	}
	public void voegManagerToe(Manager manager){
		managers.add(manager);
		
	}
	public void removeManagers(String persoonID) {
		for (Manager manager : managers) {
			if (persoonID == manager.getPersonID()) {
				managers.remove(persoonID);
			}
		}
	}
	public List<Cursist> getCursisten(){
		return cursisten;
	}
	public void voegCursistToe(Cursist cursist){
		cursisten.add(cursist);
	}
	public void removeCursisten(String persoonID) {
		for (Cursist cursist : cursisten) {
			if (persoonID == cursist.getPersonID()) {
				cursisten.remove(persoonID);
			}
		}
	}
	public Cursist zoekCursist(String persoonID){
		Cursist resp = null;
		for (Cursist cursist : cursisten) {
			if (persoonID == cursist.getPersonID()) {
				resp = cursist;
			}
		}
		return resp;
	}
	public Manager zoekManager(String persoonID){
		Manager resp = null;
		for (Manager manager : managers) {
			if (persoonID == manager.getPersonID()) {
				resp = manager;
			}
		}
		return resp;
	}
}
