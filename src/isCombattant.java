public interface isCombattant extends isPnj {

    public void attaquer(pnj cible);

    public int getPuissance();

    public void setPuissance(int puissance);

    public default void tuer(pnj cible) {
        cible.setPv(0);
    }
}
