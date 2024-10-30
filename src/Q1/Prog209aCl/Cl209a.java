package Q1.Prog209aCl;

public class Cl209a {
    private int myNum;
    private int myTotal;
    private int myLess;
    private int myGreater;

    private void calc() {
        if (myNum < 500) {
            myLess++;
            myTotal++;
        }
        if (myNum >= 500) {
            myGreater++;
            myTotal++;
        }
    }

    public Cl209a(int Num) {
        myNum     = Num;
        myTotal   = 0;
        myLess    = 0;
        myGreater = 0;
    }

    public void   setComm()  { calc(); }

    public int    getGreater()    { return myGreater; }
    public int    getLess()       { return myLess;    }
    public int    getTotal()      { return myTotal;   }

    public String toString() { return "The amount of numbers less than 500 is: " + getLess() +
            "\nThe amount of numbers greater than or equal to 500 is: " + getGreater() +
            "\nThe total amount of numbers is: " + getTotal(); }
    }
