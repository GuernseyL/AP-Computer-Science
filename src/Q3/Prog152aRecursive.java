package Q3;

public class Prog152aRecursive {
    public static int SumSeries(int n) {
        if (n >= 9669) return 9669;         // Base/Ending Case
        return n + SumSeries(n+3); // Recursive Case
    }

    public static void main(String[] args) {
        int fact = SumSeries(3);
        System.out.println("The sum of the multiples of 3, from 3 to 9669 is: " + fact);
    }
}
