import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import exercice.Exercice1;
import java.util.*;

public class ExerciceTest {
    @Test
    public void testSolution() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), Exercice1.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Exercice1.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        // Chaine vide
        assertEquals(List.of(""), Exercice1.solution("",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Exercice1.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        // Ajoutez vos test ici...
    }
}