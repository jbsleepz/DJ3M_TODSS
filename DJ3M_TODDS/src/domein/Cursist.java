package domein;

import java.util.Date;
import java.util.List;

public class Cursist extends Persoon {

	private List<Cursus> volgtCursussen;

	public Cursist(String nm, String em, String ww, Date gb, String ad) {

		super(nm, em, ww, gb, ad);
		// TODO Auto-generated constructor stub
	}

	public void voegCursusToe(Cursus cursus) {
		// maak uniek
		volgtCursussen.add(cursus);
	}

	public void removeCursusToe(String cursus) {
		if (getNaam(cursus) != null) {
			volgtCursussen.remove(getNaam(cursus));
		}
	}

	public Cursus getNaam(String naam) {
		Cursus c = null;
		for (Cursus cur : volgtCursussen) {
			if (naam == cur.getCursusCode()) {
				c = cur;
			}
		}
		return c;
	}

}
