import java.util.ArrayList;

public class Necromancien extends Combattant implements isCombattant {

    private ArrayList<Squelette> Sbires;

    public Necromancien(int pv, int puissance, int id, String Tag) {
        super(pv, puissance, id, Tag);
    }

    @Override
    public void tuer(pnj cible) {
        cible.setPv(0);
        Sbires.add(new Squelette(15, 5, GameManager.CreateNewId(), "Squelette" + Sbires.size()));
    }
}
