import java.util.LinkedList;
import java.util.List;

public class Partition
{
    public static List<Integer> partition(List<Integer> rigtigeListe, int e)
    {
        // Laver en midlertidigListe som Linkedlist
        List<Integer> midlertidigListe = new LinkedList<Integer>();

        // For hver gang E fra den rigtigeListe
        for (Integer E : rigtigeListe)
        {
            // Hvis E mod e er mindre end 0
            // tilføj E til den midlertidigListe
            if (E.compareTo(e) < 0)
            {
                midlertidigListe.add(E);
            }
        }

            // For hver gang EE fra den rigtigeListe
            for (Integer EE : rigtigeListe)
            {
                // Hvis EE mod e er større end 0
                // tilføj EE til den midlertidigListe
                if (EE.compareTo(e) > 0)
                {
                    midlertidigListe.add(EE);
                }
            }


        //Returnerer den midlertidigListe
        return midlertidigListe;
    }
}
