package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "exemple de texte exemplaire exemples a classer wario nigga 672 xylophone mignon ae at";
        List<Character> ordre = List.of('c', 't', 'e', '6', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        System.out.println(ExerciceSimplicitePire.solution(texte,ordre));
        // output: [classer, texte, exemple, a, de]
    }
}
