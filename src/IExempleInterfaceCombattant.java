public interface IExempleInterfaceCombattant extends IExempleinterfacePnj {

    public void attaquer(pnj cible);

    public int getPuissance();

    public void setPuissance(int puissance);

    public static void tuer(pnj cible) {
        cible.setPv(0);
    }
}
