public class pnj implements IExempleinterfacePnj {

    private int pv;
    private int id;
    private String Tag;

    public pnj(int pv, int id, String Tag) {
        this.pv = pv;
        this.id = id;
        this.Tag = Tag;
    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String getTag() {
        return "";
    }

    @Override
    public void setTag(String tag) {

    }

    @Override
    public int getPv() {
        return 0;
    }

    @Override
    public void setPv(int pv) {

    }
}
