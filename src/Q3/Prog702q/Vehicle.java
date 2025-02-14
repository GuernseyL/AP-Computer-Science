package Q3.Prog702q;

public class Vehicle implements Automobile {
    private String myName;
    private int myTires;
    private double myWorth;

    public Vehicle(String MN, int MT, double MW){
        myName = MN;
        myTires = MT;
        myWorth = MW;
    }

    public String getName() { return myName; }
    public int getTire() { return myTires; }
    public double getValue() {return myWorth; }

}
