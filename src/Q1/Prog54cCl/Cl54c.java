package Q1.Prog54cCl;

public class Cl54c {
    private double myRad;
    private double myCircum;
    private double myArea;


    public Cl54c(double rad){
        myRad = rad;
        myCircum = 0.0;
        myArea = 0.0;
    }

    public void calc() {
        myCircum = 2 * 3.14 * myRad;
        myArea = Math.pow(myRad, 2) * 3.14;
    }

    public double getCircum() { return myCircum; }
    public double getArea() { return myArea; }
}
