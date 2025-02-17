package Q3.Prog703s;

public class Windows extends Computer {
    private double myVersion;

    public Windows(String MN, int MNU, double MV, double MVN) {
        super(MN, MNU, MV);
        myVersion = MVN;
    }

    public double getVersion() { return myVersion; }
}
