import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import exercice.EfficaciteMeilleur32;
import exercice.EfficaciteMeilleur65;
import exercice.Exercice;
import exercice.SimpliciteMeilleur47;
import exercice.SimplicitePire66;
import exercice.Simplicitepire16;
import exercice.efficacite_pire44;
import exercice.efficacitepire57;
import exercice.sobrietemeilleur29;
import exercice.sobrietemeilleur7;
import exercice.sobrietepire17;

import java.util.*;

public class ExerciceSimpliciteMeilleurTest {
    @Test
    public void testSolution() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666", "the", "the", "number", "of", "beast"),efficacitepire57.solution("666, the number of the beast", List.of('6', 't', 'n', 'o', 'b')));
        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"),efficacitepire57.solution("OK", List.of('a', 'b', 'c', 'd', 'e')));
        // Chaine vide
        //assertEquals(List.of(""), sobrietepire17.solution("", List.of('6', 't', 'n', 'o', 'b')));
        // Chaine vide 2
        assertEquals(List.of(), efficacitepire57.solution("",List.of('6', 't', 'n','o', 'b')));
        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), efficacitepire57.solution("Il fait beau aujourd'hui comme en aout", List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));

        //Nouveaux tests
        List<String> expected = Arrays.asList("test", "non", "oui");
        List<Character> alphabet = Arrays.asList('t', 'n', 'o', 'b');
        String phrase = "test, oui; non ?";

        List<String> result = efficacitepire57.solution(phrase, alphabet);

        assertEquals(expected, result);
    }
}