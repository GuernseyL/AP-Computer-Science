package Q2.Prog215i;

public class MPG {
    private double MyMPG;

    public MPG(double MPG) { MyMPG = MPG; }
    public double getMPG() { return MyMPG; }

    public double calc(Cl215i thing){
        if (thing.getGallons() == 0) {
            return 0;
        }
        MyMPG = thing.getMiles()/thing.getGallons();
        return MyMPG;
    }
}
