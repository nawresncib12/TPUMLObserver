
public class PorteGarage extends Sujet {
	public void setEtat(Etat e) {
		this.s = e;
	}

	public void fermer() {
		s.nextState();
		s.fermer();
	}

	public void ouvrir() {
		s.nextState();
		s.ouvrir();
	}

	public void nextState(Etat e) {
		s = e;
		this.notifier();
	}

}
