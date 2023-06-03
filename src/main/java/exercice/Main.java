package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "exemple de texte exemplaire exemples a zoing classer wario 672 exemplaires exemplairem xylophone mignon ae at";
        List<Character> ordre = List.of('c', 't', 'e', '6', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');

        long start = System.nanoTime();
        System.out.println(ExerciceSimpliciteMeilleur.solution(texte, ordre));
        System.out.println("Temps exec 1 : " + (System.nanoTime() - start) / 1_000_000.0);

        start = System.nanoTime();
        System.out.println(ExerciceSimplicitePire.solution(texte, ordre));
        System.out.println("Temps exec 2 : " + (System.nanoTime() - start) / 1_000_000.0);

        start = System.nanoTime();
        System.out.println(ExerciceEfficaceMeilleur.solution(texte, ordre));
        System.out.println("Temps exec 3 : " + (System.nanoTime() - start) / 1_000_000.0);

        start = System.nanoTime();
        System.out.println(ExerciceEfficacePire.solution(texte, ordre));
        System.out.println("Temps exec 3 : " + (System.nanoTime() - start) / 1_000_000.0);

        start = System.nanoTime();
        System.out.println(ExerciceSobrieteMeilleur.solution(texte, ordre));
        System.out.println("Temps exec 4 : " + (System.nanoTime() - start) / 1_000_000.0);

        start = System.nanoTime();
        System.out.println(ExerciceSobrietePire.solution(texte, ordre));
        System.out.println("Temps exec 4 : " + (System.nanoTime() - start) / 1_000_000.0);

        // output: [classer, texte, exemple, exemples, exemplaire, 672, xylophone, a,
        // ae, at, mignon, de, wario]
    }
}
