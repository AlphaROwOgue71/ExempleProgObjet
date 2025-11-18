public class pnj implements isPnj {

    private int pv;
    private int id;
    private String tag;

    public pnj(int pv, int id, String Tag) {
        this.pv = pv;
        this.id = id;
        this.tag = tag;
    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTag() {
        return this.tag;
    }

    @Override
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public int getPv() {
        return this.pv;
    }

    @Override
    public void setPv(int pv) {
        this.pv = pv;
    }

    @Override
    public void recevoirDegats(int amount) {
        setPv(getPv() - amount);
    }
}
