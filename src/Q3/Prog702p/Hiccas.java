package Q3.Prog702p;

public class Hiccas extends BIG {
    private double myMoney;

    public Hiccas(String MN, String MW, double MM) {
        super(MN, MW);
        myMoney = MM;
    }

    public double getMoney() { return myMoney; }
}
