package Q3.Prog703s;

public class Computer implements Types{
    private String myName;
    private int myNumber;
    private double myValue;

    public Computer(String MN, int MNU, double MV) {
        myName = MN;
        myNumber = MNU;
        myValue = MV;
    }

    public String getName() { return myName; }
    public int getNumber() { return myNumber; }
    public double getValue() { return myValue; }

}
