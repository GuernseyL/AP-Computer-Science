package Q3.Prog702p;

public class Beepers extends BIG{
    private String mySpecial;

    public Beepers(String MN, String MW, String MS) {
        super(MN, MW);
        mySpecial = MS;
    }

    public String getSpecial() { return mySpecial; }
}
