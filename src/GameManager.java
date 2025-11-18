public class GameManager {

    private static Jeu jeu;

    public static void main(String[] args) {
        jeu = new Jeu();
    }

    public static int CreateNewId(){
        return jeu.getEntityIg().size();
    }
}
