package exercice;

import java.util.ArrayList;
import java.util.List;

public class ExerciceSimplicitéMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {

        String[] mots = str.split("[^a-zA-Z0-9]");

        List<String> motsClasses = new ArrayList<>();

        for (int i = 0; i < ordre.size(); i++) {
            char lettre = ordre.get(i);

            for (int j = 0; j < mots.length; j++) {
                String mot = mots[j];

                if (mot.length() > 0 && mot.charAt(0) == lettre) {
                    motsClasses.add(mot);
                }
            }
        }

        for (int i = 0; i < mots.length; i++) {
            String mot = mots[i];
            if (mot.length() > 0 && !motsClasses.contains(mot)) {
                motsClasses.add(mot);
            }
        }

        return motsClasses;
    }
}



