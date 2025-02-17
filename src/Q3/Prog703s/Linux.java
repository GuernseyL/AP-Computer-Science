package Q3.Prog703s;

public class Linux extends Computer{
    private int myCode;

    public Linux(String MN, int MNU, double MV, int MC) {
        super(MN, MNU, MV);
        myCode = MC;
    }

    public int getCode() { return myCode; }
}
