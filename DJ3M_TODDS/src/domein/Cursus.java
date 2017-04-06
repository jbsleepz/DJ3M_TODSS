package domein;

import java.util.Date;
import java.util.List;

public class Cursus {
	private String CursusID;
	private String Omschrijving;
	private double CursusPrijs;
	private List<Training> trainingen;

	public Cursus() {
		super();
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
}
