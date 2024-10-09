package Q1.Prog54bCl;

public class Cl54b {
    private int myNum1;
    private int myNum2;
    private int myNum3;
    private int myNum4;
    private int mySum;

    public Cl54b(int num1, int num2, int num3, int num4) {
        // Set up private data
        myNum1 = num1;
        myNum2 = num2;
        myNum3 = num3;
        myNum4 = num4;
        mySum = 0;
    }

    public void calc(){
        mySum = myNum1 + myNum2+ myNum3 + myNum4;
    }

    public int getSum() { return mySum; }
}
