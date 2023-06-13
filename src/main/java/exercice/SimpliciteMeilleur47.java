package exercice;

import java.util.*;

public class SimpliciteMeilleur47 {
    public static List<String> solution(String texte, List<Character> ordre) {
        List<String> mots = new ArrayList<>(Arrays.asList(texte.split(" ")));
        
        mots.sort((a, b) -> {
            int minLength = Math.min(a.length(), b.length());
            
            for (int i = 0; i < minLength; i++) {
                char charA = a.charAt(i);
                char charB = b.charAt(i);
                
                int indexA = ordre.indexOf(charA);
                int indexB = ordre.indexOf(charB);
                
                if (indexA != indexB) {
                    return indexA - indexB;
                }
            }
            
            return a.length() - b.length();
        });
        
        return mots;
    }
}
