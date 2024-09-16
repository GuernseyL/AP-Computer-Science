package Q1;

public class Prog122c {
    public static void main(String[] args) {
        int num = 2;
        int add;
        int dbl;
        int pow;
        while (num <= 10) {
            add = num + 1;
            dbl = num * 2;
            pow = num * num;
            System.out.println(num + "\t\t" + add + "\t\t" + dbl + "\t\t" + pow);
            num += 2;
        }
    }
}
/*
2		3		4		4
4		5		8		16
6		7		12		36
8		9		16		64
10		11		20		100
 */
