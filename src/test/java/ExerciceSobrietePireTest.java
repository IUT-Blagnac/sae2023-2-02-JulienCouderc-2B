import org.junit.Test;
import static org.junit.Assert.assertEquals;

import exercice.ExerciceSobrietePire;

import java.util.*;

public class ExerciceSobrietePireTest {
    @Test
    public void testSolution() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), ExerciceSobrietePire.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), ExerciceSobrietePire.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        // Chaine vide
        assertEquals(List.of(), ExerciceSobrietePire.solution("",List.of('6', 't', 'n', 'o', 'b')));        
        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), ExerciceSobrietePire.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        // Ajoutez vos test ici...
    }
}
