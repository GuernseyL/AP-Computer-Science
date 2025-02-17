package Q3.Prog703s;

public class Apple extends Computer{
    private String myColor;

    public Apple(String MN, int MNU, double MV, String MC) {
        super(MN, MNU, MV);
        myColor = MC;
    }

    public String getColor() { return myColor; }
}
