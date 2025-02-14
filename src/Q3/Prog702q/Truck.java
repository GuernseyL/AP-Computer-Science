package Q3.Prog702q;

public class Truck extends Vehicle{
    public int myMileage;

    public Truck(String MN, int MT, double MW, int MM) {
        super(MN, MT, MW);
        myMileage = MM;
    }

    public int getMileage() { return myMileage; }
}
