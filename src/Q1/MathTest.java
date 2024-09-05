package Q1;

public class MathTest {
    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3); // 2^3

        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        sum /= 3;

        num1 = num1 + 1;
        num1 += 1;
        num1 ++; // and -- for subracting 1

        // Arithmetic ops: + - * / %
        // Assignment ops: = += -= *= /= %= ++ --

        int test = 3/4; // equals - because of int division; use 3/4.0 instead and save in a double
        System.out.println(test);

        final double PI = 3.14159;

        double myWallet = 2984.2321056432245001894032432197600;
        double myWRounded = Math.round(myWallet * 100.0) / 100.0;

        System.out.println(myWRounded);
        System.out.printf("myWRounded = %.2f\n", myWallet); //%.#2 # of decimals

    }
}
