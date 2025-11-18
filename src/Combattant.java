public class Combattant extends pnj implements isCombattant {

    private int puissance;

    public Combattant(int pv, int puissance, int id, String Tag) {
        super(pv, id, Tag);
        this.puissance = puissance;
    }

    @Override
    public void attaquer(pnj cible) {
        cible.recevoirDegats(puissance);
        if (cible.getPv()<=0){
            tuer(cible);
        }
    }

    @Override
    public int getPuissance() {
        return puissance;
    }

    @Override
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
