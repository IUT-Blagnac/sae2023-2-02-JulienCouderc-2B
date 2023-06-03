package exercice;

import java.util.ArrayList;
import java.util.List;

public class ExerciceSimpliciteMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        String[] mots = str.split("[^a-zA-Z0-9]");

        List<String> motsClasses = new ArrayList<>();
        List<String> motsAvecLettreInconnue = new ArrayList<>();

        for (int i = 0; i < mots.length; i++) {
            String mot = mots[i];
            if (mot.length() > 0) {
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
        if (ordre.size()==0) {
            return true;
        }
        char premiereLettre = mot.charAt(0);
        return ordre.contains(premiereLettre);
    }

    private static int compareMots(String mot1, String mot2, List<Character> ordre) {

        int longueurMot1 = mot1.length();
        int longueurMot2 = mot2.length();
        int longueurMinimale;

        if(longueurMot1>longueurMot2){
            longueurMinimale = longueurMot2;
        }else{
            longueurMinimale = longueurMot1;
        }
        for (int i = 0; i < longueurMinimale; i++) {
            char char1 = mot1.charAt(i);
            char char2 = mot2.charAt(i);
    
            if (char1 != char2) {
                int index1 = -1;
                int index2 = -1;
                
                for (int j = 0; j < ordre.size(); j++) {
                    if (ordre.get(j) == char1) {
                        index1 = j;
                        break;
                    }
                }
                
                for (int j = 0; j < ordre.size(); j++) {
                    if (ordre.get(j) == char2) {
                        index2 = j;
                        break;
                    }
                }
                
                if (index1 < index2) {
                    return -1; 
                } else {
                    return 1; 
                }
            }
        }

        if (longueurMot1 < longueurMot2) {
            return -1;
        } else if (longueurMot1 > longueurMot2) {
            return 1;   
        } else {
            return 0; 
        }
        
    }
}


