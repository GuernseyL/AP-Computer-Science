package Q3.Prog505a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cl505a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/FILENAME"));
            List<NovelPerson>   list       = new ArrayList<NovelPerson>();

            while (file.hasNext()) {
                String          fname      = file.next()                 ;
                String          lname      = file.next()                 ;
                int             books      = file.nextInt()              ;
                String          name       = fname + " " + lname         ;
                NovelPerson     wowser     = new NovelPerson(name, books);
                list.add(wowser)                                         ;
                }
            for (int lcv = 0;   lcv < list.size(); lcv++)                {
                NovelPerson     cur        = list.get(lcv)               ;
                cur.calc()                                               ;
            }

            System.out.println("Reading Context:\nName\tBooks\tPoints")  ;
            for (NovelPerson n : list)
                System.out.println(n)                                    ;

            double              tot        = 0                           ;
            for (NovelPerson n : list) tot += n.getPoints()              ;
            double              avg        = tot /list.size()            ;
            System.out.println("\nAverage points: " + avg)               ;

            int                 bestPoints = list.get(0).getPoints()     ;
            String bestName =   list.get(0).getName()                    ;
            for (int lcv = 1;   lcv < list.size(); lcv++)                {
                NovelPerson     bill       = list.get(lcv)               ;
                if (bill.getPoints() > bestPoints)                       {
                                bestPoints = bill.getPoints()            ;
                                bestName   = bill.getName()              ;
                }
            }

        } catch (IOException e)                                          {
            System.out.println("Error: " + e)                            ;
        }
}
}
