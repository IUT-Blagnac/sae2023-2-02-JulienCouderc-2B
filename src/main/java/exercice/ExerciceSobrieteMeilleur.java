package exercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciceSobrieteMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> motsClasses = new ArrayList<>();
        List<String> motsAvecLettreInconnue = new ArrayList<>();
        StringBuilder motBuilder = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                motBuilder.append(c);
            } else {
                String mot = motBuilder.toString().trim();
                motBuilder.setLength(0);

                if (!mot.isEmpty()) {
                    if (commenceParLettre(mot, ordre)) {
                        motsClasses.add(mot);
                    } else {
                        motsAvecLettreInconnue.add(mot);
                    }
                }
            }
        }

        String lastMot = motBuilder.toString().trim();
        if (!lastMot.isEmpty()) {
            if (commenceParLettre(lastMot, ordre)) {
                motsClasses.add(lastMot);
            } else {
                motsAvecLettreInconnue.add(lastMot);
            }
        }

        Comparator<String> comparator = (mot1, mot2) -> {
            int minLength = Math.min(mot1.length(), mot2.length());
            for (int i = 0; i < minLength; i++) {
                char char1 = mot1.charAt(i);
                char char2 = mot2.charAt(i);
                if (char1 != char2) {
                    return Integer.compare(ordre.indexOf(char1), ordre.indexOf(char2));
                }
            }
            return Integer.compare(mot1.length(), mot2.length());
        };

        Collections.sort(motsClasses, comparator);
        Collections.sort(motsAvecLettreInconnue, comparator);
        motsClasses.addAll(motsAvecLettreInconnue);
        return motsClasses;
    }

    private static boolean commenceParLettre(String mot, List<Character> ordre) {
        if (ordre.isEmpty()) {
            return true;
        }
        char premiereLettre = mot.charAt(0);
        return ordre.contains(premiereLettre);
    }
}
