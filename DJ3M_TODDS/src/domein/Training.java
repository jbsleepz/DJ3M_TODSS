package domein;

import java.util.Date;
import java.util.List;

public class Training {
	private String trainingID;
	private String naam;
	private Date beginDatum;
	private Date eindDatum;;
	private List<Opdrachten> opdrachten;
	private Docent docent;
	
	public Training(){
	}

	public String getTrainingID() {
		return trainingID;
	}

	public void setTrainingID(String trainingID) {
		this.trainingID = trainingID;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
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

	public List<Opdrachten> getOpdrachten() {
		return opdrachten;
	}

	public void setOpdrachten(List<Opdrachten> opdrachten) {
		this.opdrachten = opdrachten;
	}

	public Docent getDocent() {
		return docent;
	}

	public void setDocent(Docent docent) {
		this.docent = docent;
	}
	
	
	
	//// MOET HIER NOG VERDER AAN WERKEN!!!
}
