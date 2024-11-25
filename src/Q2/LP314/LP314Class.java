package Q2.LP314;

public class LP314Class {
    private int AWNY;
    private int AWNJ;
    private int AWCN;
    private int MRNY;
    private int MRNJ;
    private int MRCN;
    private int TOTAW;
    private int TOTMR;
    private double PERAW;
    private double PERMR;
    private int TOT;

    public LP314Class (int AY, int AJ, int AN, int MY, int MJ, int MN){
        AWNY = AY;
        AWNJ = AJ;
        AWCN = AN;
        MRNY = MY;
        MRNJ = MJ;
        MRCN = MN;
    }

    public void calc() {
        TOTAW = AWNY + AWNJ + AWCN;
        TOTMR = MRNY + MRNJ + MRCN;
        TOT = TOTAW + TOTMR;
        PERAW = TOTAW / TOT;
        PERMR = TOTMR / TOT;
    }

    public int getTOTAW() { return TOTAW; }
    public int getTOTMR() { return TOTMR; }
    public int getTOT()   { return TOT;   }
    public double getPERAW() { return PERAW; }
    public double getPERMR() { return PERMR; }
}
