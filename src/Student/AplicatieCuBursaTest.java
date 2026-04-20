package Student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AplicatieCuBursaTest
{
    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();

    @Test
    void sortTest1()
    {
        List<StudentBursier> lista = appCuBursa.genereaza();
        List<StudentBursier> sortata = appCuBursa.sorteaza(lista);

        for (int i = 0; i < sortata.size() - 1; i++)
        {
            StudentBursier s1 = sortata.get(i);
            StudentBursier s2 = sortata.get(i + 1);

            int formatieComp = s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu());
            Assertions.assertTrue(formatieComp <= 0, "Eroare la sortarea după formație");

            if (formatieComp == 0)
            {
                int numeComp = s1.getNume().compareTo(s2.getNume());
                Assertions.assertTrue(numeComp <= 0, "Eroare la sortarea după nume");
            }
        }
    }
}
