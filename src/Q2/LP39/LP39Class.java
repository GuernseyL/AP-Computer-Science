package Q2.LP39;

public class LP39Class {
    private int    BirthYear;
    private int    BirthMonth;
    private int    BirthDay;
    private int    CurrentYear;
    private int    CurrentMonth;
    private int    CurrentDay;
    private double Alive;
    private double Sleep;

    public LP39Class(int BY, int BM, int BD, int CY, int CM, int CD) {
        BirthYear    = BY;
        BirthMonth   = BM;
        BirthDay     = BD;
        CurrentYear  = CY;
        CurrentMonth = CM;
        CurrentDay   = CD;
    }

    public void calc() {
        Alive = (double) (((CurrentYear - BirthYear) * 365.25) + (12 - BirthMonth) + CurrentMonth + (30 - BirthDay) +
                CurrentDay);
        Sleep = Alive * 8;
    }

    public double getAlive() { return Alive; }
    public double getSleep() { return Sleep; }
}
