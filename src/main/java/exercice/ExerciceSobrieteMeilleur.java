package exercice;

import java.util.*;

public class ExerciceSobrieteMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> motsClasses = new ArrayList<>();
        List<String> motsAvecLettreInconnue = new ArrayList<>();
        StringBuilder motBuilder = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                motBuilder.append(c);
            } else {
                String mot = motBuilder.toString();
                motBuilder.setLength(0);

                if (!mot.isEmpty()) {
                    List<String> listeDestination = ordre.contains(mot.charAt(0)) ? motsClasses : motsAvecLettreInconnue;
                    insertIntoSorted(mot, listeDestination, ordre);
                }
            }
        }

        String lastMot = motBuilder.toString();
        if (!lastMot.isEmpty()) {
            List<String> listeDestination = ordre.contains(lastMot.charAt(0)) ? motsClasses : motsAvecLettreInconnue;
            insertIntoSorted(lastMot, listeDestination, ordre);
        }

        motsClasses.addAll(motsAvecLettreInconnue);
        return motsClasses;
    }

    private static void insertIntoSorted(String mot, List<String> motsClasses, List<Character> ordre) {
        int index = 0;
        while (index < motsClasses.size() && compareMots(mot, motsClasses.get(index), ordre) >= 0) {
            index++;
        }
        motsClasses.add(index, mot);
    }

    private static int compareMots(String mot1, String mot2, List<Character> ordre) {
        int minLength = Math.min(mot1.length(), mot2.length());
        for (int i = 0; i < minLength; i++) {
            char char1 = mot1.charAt(i);
            char char2 = mot2.charAt(i);
            if (char1 != char2) {
                return Integer.compare(ordre.indexOf(char1), ordre.indexOf(char2));
            }
        }
        return Integer.compare(mot1.length(), mot2.length());
    }
}
