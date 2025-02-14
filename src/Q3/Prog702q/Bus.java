package Q3.Prog702q;

public class Bus extends Vehicle{
    public String myTown;

    public Bus(String MN, int MT, double MW, String MHT) {
        super(MN, MT, MW);
        myTown = MHT;
    }

    public String getTown() { return myTown; }
}
