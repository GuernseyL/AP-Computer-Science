package Q1;

public class Prog166e {
    public static void main(String[] args) {
        int n = 0;
        int d = 1;
        double f = 0;

        while (n < 15 && d <= 15) {
            n += 1;
            if (n == d) {
                d++;
                if (n != 14) {
                    n = 1;
                }
            }
            f = (double)n/d;
            System.out.printf("%d/%d\t\t%.5f\n" , n, d, f);
        }
    }
}
