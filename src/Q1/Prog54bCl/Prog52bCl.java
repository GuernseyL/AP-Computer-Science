package Q1.Prog54bCl;
import java.util.Scanner;

public class Prog52bCl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int n1 = input.nextInt();
        System.out.print("Enter num2: ");
        int n2 = input.nextInt();
        System.out.print("Enter num3: ");
        int n3 = input.nextInt();
        System.out.print("Enter num4: ");
        int n4 = input.nextInt();

        Cl54b wow = new Cl54b(n1, n2, n3 ,n4);
        wow.calc();
        int Sum = wow.getSum();

        System.out.println("The sum of the 4 numbers is: " + Sum);
    }
}
/*
Enter num1: 1
Enter num2: 2
Enter num3: 3
Enter num4: 4
The sum of the 4 numbers is: 10
 */
