package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "exemple de texte exemplaire exemples a zoing classer wario 672 exemplaires exemplairem xylophone mignon ae at";
        List<Character> ordre = List.of('c', 't', 'e', '6', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');

        System.out.println(sobrietemeilleur7.solution(texte, ordre));
        
    }
}
