package exercice;

import java.util.ArrayList;
import java.util.List;

public class ExerciceSobrieteMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> motsClasses = new ArrayList<>();
        List<String> motsAvecLettreInconnue = new ArrayList<>();

        StringBuilder motBuilder = new StringBuilder();

        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            char c = str.charAt(i);
            if (isAlphaNumeric(c)) {
                motBuilder.append(c);
            } else {
                String mot = motBuilder.toString();
                motBuilder.setLength(0);

                if (!mot.isEmpty()) {
                    if (commenceParLettre(mot, ordre)) {
                        insertIntoSorted(mot, motsClasses, ordre);
                    } else {
                        motsAvecLettreInconnue.add(mot);
                    }
                }
            }
        }

        String lastMot = motBuilder.toString();
        if (!lastMot.isEmpty()) {
            if (commenceParLettre(lastMot, ordre)) {
                insertIntoSorted(lastMot, motsClasses, ordre);
            } else {
                motsAvecLettreInconnue.add(lastMot);
            }
        }

        motsClasses.addAll(motsAvecLettreInconnue);
        return motsClasses;
    }

    private static boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private static boolean commenceParLettre(String mot, List<Character> ordre) {
        if (ordre.isEmpty()) {
            return true;
        }
        char premiereLettre = mot.charAt(0);
        return ordre.contains(premiereLettre);
    }

    private static void insertIntoSorted(String mot, List<String> motsClasses, List<Character> ordre) {
        int index = 0;
        int motsCount = motsClasses.size();

        while (index < motsCount && compareMots(mot, motsClasses.get(index), ordre) >= 0) {
            index++;
        }

        motsClasses.add(index, mot);
    }

    private static int compareMots(String mot1, String mot2, List<Character> ordre) {
        int length1 = mot1.length();
        int length2 = mot2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            char char1 = mot1.charAt(i);
            char char2 = mot2.charAt(i);

            if (char1 != char2) {
                int index1 = ordre.indexOf(char1);
                int index2 = ordre.indexOf(char2);

                return Integer.compare(index1, index2);
            }
        }

        return Integer.compare(length1, length2);
    }
}


