package Q3.ABCLab;

public class Circle implements Shape{
    private double radius;

    public Circle(double r) { radius = r; }

    public void calcArea() {
        System.out.println("area: " + (Math.PI * Math.pow(radius, 2)));
    }

    public void calcPerim() {
        System.out.println("Circumfrence: " + (2 * Math.PI * radius));
    }

    public void calcCircumfrence() { this.calcPerim(); }

    public void printClass() {
        System.out.println(this.getClass().getSimpleName());
    }
}
