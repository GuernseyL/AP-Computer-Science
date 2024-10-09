package Q1.Prog88aCl;

public class Cl88a {
    private int myNum1;
    private int myNum2;
    private int mySum;
    private int myDiff;
    private int myProd;
    private double myAve;
    private int myAbs;
    private int myMax;
    private int myMin;

    public Cl88a(int num1, int num2){
        myNum1 = num1;
        myNum2 = num2;
        mySum = 0;
        myDiff = 0;
        myProd = 0;
        myAve = 0.0;
        myAbs = 0;
        myMax = 0;
        myMin = 0;
    }

    public void calc(){
        mySum = myNum1 + myNum2;
        myDiff = myNum1 - myNum2;
        myProd = myNum1 * myNum2;
        myAve = (double) myNum1 / myNum2;
        myAbs = Math.abs(myDiff);
        if (myNum1 > myNum2) {
            myMax = myNum1;
        }
        else {
            myMax = myNum2;
        }
        if (myNum1 == myMax) {
            myMin = myNum2;
        }
        else {
            myMin = myNum1;
        }
    }

    public int getFine() { return myFine; }
}
