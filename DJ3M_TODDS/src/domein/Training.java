package domein;

import java.util.List;

public class Training {
	private String naam;
	private String trainingsCode;
	private int verwachteTijd;
	private List<Opdrachten> opdrachten;
	
	public Training(String nm,String tc,int vt){
		naam = nm;
		trainingsCode = tc;
		verwachteTijd = vt;
	}
	public void VoegOpdrachtenToeAanTraining(Opdrachten Op){
		opdrachten.add(Op);
		//maak uniek
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
	 * @return the trainingsCode
	 */
	public String getTrainingsCode() {
		return trainingsCode;
	}
	/**
	 * @param trainingsCode the trainingsCode to set
	 */
	public void setTrainingsCode(String trainingsCode) {
		this.trainingsCode = trainingsCode;
	}
	/**
	 * @return the verwachteTijd
	 */
	public int getVerwachteTijd() {
		return verwachteTijd;
	}
	/**
	 * @param verwachteTijd the verwachteTijd to set
	 */
	public void setVerwachteTijd(int verwachteTijd) {
		this.verwachteTijd = verwachteTijd;
	}
	
	
	
}
