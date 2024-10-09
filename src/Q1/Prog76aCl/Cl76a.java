package Q1.Prog76aCl;

public class Cl76a {
    private int myDislike;
    private int mySurprise;

    public Cl76a(int dis){
        myDislike = dis;
        mySurprise = 0;
    }

    public void calc(){
        mySurprise = (myDislike * 9) * 12345679;
    }

    public int getSurprise() { return mySurprise; }
}
