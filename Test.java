
public class Test {

	public static void main(String[] args) {
		InterfaceGraphique ig= new InterfaceGraphique();
		PorteGarage p=new PorteGarage();
		Fermeture e = new Fermeture(p);
		p.addObserver(ig);
		p.setEtat(e);
		p.ouvrir();
		p.fermer();
	}

}
