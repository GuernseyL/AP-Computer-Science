package Q2.Prog215i;

public class Cl215i {
    private int MyVehicle;
    private double MyMiles;
    private double MyGallons;
    private double MyMPG;

    public Cl215i(int Veh, double Mil, double Gal, double MPG) {
        MyVehicle = Veh;
        MyMiles = Mil;
        MyGallons = Gal;
        MyMPG = MPG;
    }

    public double calc(){
        MyMPG = MyMiles/MyGallons;
        return MyMPG;
    }

    public int getVehicle() { return MyVehicle; }
    public double getMiles() { return MyMiles; }
    public double getGallons() { return MyGallons; }
    public double getMPG() { return MyMPG; }

}
