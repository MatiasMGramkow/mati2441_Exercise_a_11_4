import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise4
{
    public static void main(String[] args)
    {
        // Laver Variabler
        int e = 5;

        // Laver et Array med de givne tal
        Integer givneTal [] = {
                15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9};

        // Laver en ny liste med de givneTal
        List<Integer> rigrigeListe = new LinkedList<Integer>(Arrays.asList(givneTal));

        // Kalder på metoden partition i klassen Pratition
        List<Integer> nyListe = Partition.partition(rigrigeListe, e);

        // Printer min nye liste
        System.out.println(nyListe);

    }
}
