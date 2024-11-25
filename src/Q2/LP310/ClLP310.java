package Q2.LP310;
import java.util.Scanner;

public class ClLP310 {
    public static void main(String[] args){
        int[] array = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in this order the amount of burgers, fries, and sodas purchased");
        for (int x = 0; x < array.length; x++ ) {
            array[x] = input.nextInt();
        }

        LP310Class dave = new LP310Class(array[0], array[1], array[2]);
        dave.calc();

        System.out.println("Your total before tax is " + dave.getBtax() + "\n Tax is " + dave.getTax() + " and your" +
                " total after tax is " + dave.getTotal());


    }
}

/*
Enter in this order the amount of burgers, fries, and sodas purchased
2
5
5
Your total before tax is 13.780000000000001
Tax is 0.8957 and your total after tax is 14.6757
 */
