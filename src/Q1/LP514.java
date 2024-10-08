package Q1;

public class LP514 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int dice3;

        System.out.println("Dice1 Dice2 Dice3");

        for (int x = 1; x <= 5; x++){
            dice1 = (int) (Math.random() * (6 - 1)) + 1;
            dice2 = (int) (Math.random() * (6 - 1)) + 1;
            dice3 = (int) (Math.random() * (6 - 1)) + 1;

            System.out.println(dice1 + "\t\t" + dice2 + "\t\t" + dice3);
        }
    }
}
