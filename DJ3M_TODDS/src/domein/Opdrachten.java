package domein;

import java.util.List;

public class Opdrachten {
	private String Opgave;
	private List opdrachtenVraag;
	private String info;
	
	public Opdrachten(String op,List ov,String in){
		setOpgave(op);
		setOpdrachtenVraag(ov);
		setInfo(in);		
	}
	public void voegOpdrachtToe(String opgave, String info){
		String s = opgave + "," + info;
		opdrachtenVraag.add(s);
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * @return the opdrachtenVraag
	 */
	public List getOpdrachtenVraag() {
		return opdrachtenVraag;
	}

	/**
	 * @param opdrachtenVraag the opdrachtenVraag to set
	 */
	public void setOpdrachtenVraag(List opdrachtenVraag) {
		this.opdrachtenVraag = opdrachtenVraag;
	}

	/**
	 * @return the opgave
	 */
	public String getOpgave() {
		return Opgave;
	}

	/**
	 * @param opgave the opgave to set
	 */
	public void setOpgave(String opgave) {
		Opgave = opgave;
	}
}
