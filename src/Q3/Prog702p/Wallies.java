package Q3.Prog702p;

public class Wallies extends BIG {
    private int mySteps;

    public Wallies (String MN, String MW, int S) {
        super(MN, MW);
        mySteps = S;
    }

    public int getSteps() { return mySteps; }
}
