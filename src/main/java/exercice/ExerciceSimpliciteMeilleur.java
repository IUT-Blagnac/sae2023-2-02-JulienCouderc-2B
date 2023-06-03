package exercice;

import java.util.ArrayList;
import java.util.List;

public class ExerciceSimpliciteMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        String[] mots = str.split("[^a-zA-Z0-9]");

        List<String> motsClasses = new ArrayList<>();
        List<String> motsAvecLettreInconnue = new ArrayList<>();

        for (String mot : mots) {
            if (!mot.isEmpty()) {
                if (commenceParLettre(mot, ordre)) {
                    boolean motInsere = false;
                    for (int j = 0; j < motsClasses.size(); j++) {
                        String motClasse = motsClasses.get(j);
                        if (compareMots(mot, motClasse, ordre) < 0) {
                            motsClasses.add(j, mot);
                            motInsere = true;
                            break;
                        }
                    }
                    if (!motInsere) {
                        motsClasses.add(mot);
                    }
                } else {
                    motsAvecLettreInconnue.add(mot);
                }
            }
        }

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

    private static int compareMots(String mot1, String mot2, List<Character> ordre) {
        int longueurMinimale = Math.min(mot1.length(), mot2.length());

        for (int i = 0; i < longueurMinimale; i++) {
            char char1 = mot1.charAt(i);
            char char2 = mot2.charAt(i);

            if (char1 != char2) {
                int index1 = ordre.indexOf(char1);
                int index2 = ordre.indexOf(char2);

                if (index1 != -1 && index2 != -1) {
                    return Integer.compare(index1, index2);
                } else if (index1 != -1) {
                    return -1;
                } else if (index2 != -1) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        return Integer.compare(mot1.length(), mot2.length());
    }
}
