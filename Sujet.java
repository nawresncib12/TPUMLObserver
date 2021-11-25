import java.util.Vector;

public class Sujet {
    public Etat s;
	public Vector<Obserevr> vect =new Vector<Obserevr>();
	public void addObserver(Obserevr o) {
		vect.add(o);
	}
	public void removeObserver(Obserevr o) {
		int i= vect.indexOf(o);
		vect.remove(i);
	}
	public void notifier(){
		for (Obserevr obs : vect) {
			obs.actualiser(s);
		}
	}
}
