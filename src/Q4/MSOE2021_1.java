package Q4;
import java.util.Scanner;

public class MSOE2021_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String Phrase = input.nextLine();
        String Word = "";
        System.out.print("Enter a letter: ");
        String Letter = input.nextLine();
        int Placeholder = 0;
        for (int x = 0; x < Phrase.length()-1; x++){
            if (Phrase.substring(x+1, x+2).equals(" ")){
                Word = Phrase.substring(Placeholder, x);
                if (Word.substring(Word.length()-1).equals(Letter)){
                    System.out.println("The first word ending with '" + Letter + "' in the phrase '" + Phrase +
                            "' is '" + Word + "'");
                    x+= Phrase.length();
                }
            }
        }


    }
}
