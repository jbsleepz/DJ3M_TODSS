package domein;

import java.util.Date;
import java.util.List;

public class CursusUitvoering {
	private Date beginPunt;
	private Date eindPunt;
	private String status;
	
	public CursusUitvoering(Date bp,Date ep, String st){
		setBeginPunt(bp);
		setEindPunt(ep);
		setStatus(st);
	}
	/**
	 * @return the beginPunt
	 */
	public Date getBeginPunt() {
		return beginPunt;
	}

	/**
	 * @param beginPunt the beginPunt to set
	 */
	public void setBeginPunt(Date beginPunt) {
		this.beginPunt = beginPunt;
	}

	/**
	 * @return the eindPunt
	 */
	public Date getEindPunt() {
		return eindPunt;
	}

	/**
	 * @param eindPunt the eindPunt to set
	 */
	public void setEindPunt(Date eindPunt) {
		this.eindPunt = eindPunt;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
