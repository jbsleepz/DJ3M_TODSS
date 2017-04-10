package domein;

import java.util.ArrayList;
import java.util.List;

public class Cursus {
	private String CursusID;
	private String Omschrijving;
	private double CursusPrijs;
	private List<Training> trainingen = new ArrayList<Training>();
	private List<CursusUitvoering> uitvoeringen = new ArrayList<CursusUitvoering>();


	public Cursus() {
	}

	public String getCursusID() {
		return CursusID;
	}

	public void setCursusID(String cursusID) {
		CursusID = cursusID;
	}

	public String getOmschrijving() {
		return Omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		Omschrijving = omschrijving;
	}

	public double getCursusPrijs() {
		return CursusPrijs;
	}

	public void setCursusPrijs(double cursusPrijs) {
		CursusPrijs = cursusPrijs;
	}

	public List<Training> getTrainingen() {
		return trainingen;
	}

	public void addTrainingToCursus(Training training) {
		trainingen.add(training);
	}

	public void removeTrainingFromCursus(String trainingID) {
		for (Training training : trainingen) {
			if (trainingID == training.getTrainingID()) {
				trainingen.remove(trainingID);
			}
		}
	}
	public Training zoekTraining(String trainingID){
		Training resp = null;
		for (Training training : trainingen) {
			if (trainingID == training.getTrainingID()) {
				resp = training;
			}
		}
		return resp;
	}
	public List<CursusUitvoering> getVolgtCursusUitvoeringen() {
		return uitvoeringen;
	}
	public void addCursusUitvoeringToCursist(CursusUitvoering cursusuitvoering) {
		uitvoeringen.add(cursusuitvoering);
	}
	public void removeCursusUitvoeringFromCursist(String uitvoeringID) {
		for(CursusUitvoering cursusuitvoering : uitvoeringen){
			if (uitvoeringID == cursusuitvoering.getUitvoeringID()){
				uitvoeringen.remove(uitvoeringID);
			}
			
		}
	}
	public CursusUitvoering zoekCursusUitvoering(String uitvoeringID){
		CursusUitvoering resp = null;
		for (CursusUitvoering cursusuitvoering : uitvoeringen) {
			if (uitvoeringID == cursusuitvoering.getUitvoeringID()) {
				resp = cursusuitvoering;
			}
		}
		return resp;
	}
}
