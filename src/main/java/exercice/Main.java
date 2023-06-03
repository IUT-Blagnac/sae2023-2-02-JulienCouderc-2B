package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "exemple de texte exemplaire exemples a classer wario 672 exemplaires exemplairem xylophone mignon ae at";
        List<Character> ordre = List.of('c', 't', 'e', '6', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        long start = System.currentTimeMillis();
        System.out.println(ExerciceSimpliciteMeilleur.solution(texte,ordre));
        System.out.println("Temps exec 1 : "+ (System.currentTimeMillis()-start)); 
        start = System.currentTimeMillis();
        System.out.println(ExerciceSimplicitePire.solution(texte,ordre));
        System.out.println("Temps exec 2 : "+ (System.currentTimeMillis()-start)); 
        start = System.currentTimeMillis();
        System.out.println(ExerciceEfficaceMeilleur.solution(texte,ordre));
        System.out.println("Temps exec 3 : "+ (System.currentTimeMillis()-start)); 





        // output: [classer, texte, exemple, exemples, exemplaire, 672, xylophone, a, ae, at, mignon, de, wario]
    }
}
