
public class InterfaceGraphique implements Obserevr{
    public void actualiser(Etat s){
        System.out.println("L'interface affiche:");
        s.afficherEtat();
    }

}
