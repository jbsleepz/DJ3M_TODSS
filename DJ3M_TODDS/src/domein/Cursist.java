package domein;

import java.util.ArrayList;
import java.util.List;

public class Cursist {
	private List <Cursus>volgtCursussen;
	
	public Cursist(){}
	
	public void voegCursusToe(Cursus cursus){
		//maak uniek
		volgtCursussen.add(cursus);
	}
	public void removeCursusToe(String cursus){
		if(getNaam(cursus) != null){
		volgtCursussen.remove(getNaam(cursus));			
		}
	}
	public Cursus getNaam(String naam){
		Cursus c = null;
		for(Cursus cur : volgtCursussen){
			if(naam == cur.getCursusCode()){
				c = cur;
			}
		}
		return c;
	}
	

}
