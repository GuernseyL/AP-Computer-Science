package Q1;
import java.util.Scanner;

public class LP416 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = Math.toRadians(input.nextDouble());

        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double tan = Math.tan(angle);

        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cos);
        System.out.println("Tangent: " + tan);


    }
}
/*
Enter an angle in degrees: 30
Sine: 0.49999999999999994
Cosine: 0.8660254037844387
Tangent: 0.5773502691896257
 */