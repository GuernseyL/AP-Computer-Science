package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] = (int) (Math.random() * (91 - 20) + 20); // random * (max-min) + min

        // 1. Print the Array from the beginning to the ned
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // 2. Print the Array from the beginning to the ned using a  for-each loop
        for (int temp : array)
            System.out.print(temp +  " ");
        System.out.println();

        // 3. What number is in the middle of the Array?
        System.out.println("The middle number is: " + array[array.length/2]);

        // 4. What is the average of the first, last, and middle numbers?
        double avg = array[0] + array[array.length - 1] + array[array.length / 2];
        System.out.println("Average of the first, middle, and last numbers is: " + (avg/3));

        // 5. Find the smallest and the largest number in the Array
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        // 6. Switch the largest with smallest number. Print the list
        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == largest) largeIndex = i;
        }

        int tempswap = array[smallIndex];
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // Step 7.
        int randNum = (int) (Math.random() * 10 + 1);
        array[array.length / 2] = randNum;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // Step 8.
        for (int i = 0; i < array.length; i++)
            array[i] += 10;

        for (int x : array) System.out.print(x + " ");
        System.out.println();

        // Step 9.
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + myThird);

        // Step 10.
        for (int num : array) {
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
        System.out.println();

        // Step 11.
        for (int i = 0; i < array.length; i++)
            if (array[i] % 4 == 0)
                System.out.print(array[i] + " ");
        System.out.println();

        // Step 12.
        boolean sixty = false;
        for (int n : array)
            if (n == 60) sixty = true;
        System.out.println("Is 50 in the list: " + sixty);

        // Step 13.
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++)
            if (array[lcv] != array[(array.length-1) - lcv])
                same = false;
        System.out.println("Is the array palindromic: " + same);

        // Step 14.
        double average = 0;
        for (int x : array) average += x;
        average /= array.length;

        int avgCount = 0;
        for (int x : array)
            if (x > average) avgCount++;
        System.out.printf("There are %d numbers greater than the average\n", avgCount);

        // step 15.
        int evens = 0;
        for (int nums : array)
            if (nums % 2 == 0) evens++;
        System.out.printf("There are %d even numbers\n", evens);

        // step 16.
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++)
            array2[i] = array[(array.length-1) - i];

        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();

        // step 17.
        int[] shiftArr = circularShiftRight(array);
        for (int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();

        // step 18.
        int sum = 0;
        for (int numi : array) {
            int digitsum = 0;
            int temp = numi;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements: " + sum);

        // step 19.


        // step 20.

        }

    }

    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++)
            shifted[lcv] = arr[lcv-1];
        shifted[0] = temp;
        return shifted;
    }
}
