public class codeEvaluationClassement {
     public static void main(String[] args) {
        String texte = "exemple de texte exemplaire exemples a zoing classer wario 672 exemplaires exemplairem xylophone mignon ae at";
        List<Character> ordre = List.of('c', 't', 'e', '6', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');

        sobrietemeilleur7.solution(texte, ordre);

         
        // Augmentation de la taille du texte
        StringBuilder texteAugmente100 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            texteAugmente100.append(texte);
        }

        StringBuilder texteAugmente1000 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            texteAugmente1000.append(texte);
        }

        // Permet de ne pas prendre en compte la compilation dans le temps d'execution et tout ce qui pourrait faire fausser
        for (int i = 0; i < 5; i++) {
            sobrietemeilleur7.solution(texte, ordre);
        }

        long totalTimeNormal = 0;
        long totalTimeAugmente100 = 0;
        long totalTimeAugmente1000 = 0;

        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime(); 
            sobrietemeilleur7.solution(texte, ordre);
            long endTime = System.nanoTime(); 
            long executionTimeNormal = endTime - startTime; 
            totalTimeNormal += executionTimeNormal;

            startTime = System.nanoTime(); 
            sobrietemeilleur7.solution(texteAugmente100.toString(), ordre);
            endTime = System.nanoTime(); 
            long executionTimeAugmente100 = endTime - startTime; 
            totalTimeAugmente100 += executionTimeAugmente100;

            startTime = System.nanoTime(); 
            sobrietemeilleur7.solution(texteAugmente1000.toString(), ordre);
            endTime = System.nanoTime(); 
            long executionTimeAugmente1000 = endTime - startTime; 
            totalTimeAugmente1000 += executionTimeAugmente1000;
        }

        double averageTimeNormal = totalTimeNormal / 5.0 / 1000000.0; 
        double averageTimeAugmente100 = totalTimeAugmente100 / 5.0 / 1000000.0; 
        double averageTimeAugmente1000 = totalTimeAugmente1000 / 5.0 / 1000000.0; 

        double ratio100 = averageTimeAugmente100 / averageTimeNormal; 
        double ratio1000 = averageTimeAugmente1000 / averageTimeNormal;

        System.out.println("Temps d'exécution normal moyen : " + averageTimeNormal + " ms");
        System.out.println("Temps d'exécution augmenté de 100 fois moyen : " + averageTimeAugmente100 + " ms");
        System.out.println("Temps d'exécution augmenté de 1000 fois moyen : " + averageTimeAugmente1000 + " ms");
        System.out.println("Ratio moyen pour une augmentation de 100 fois : " + ratio100);
        System.out.println("Ratio moyen pour une augmentation de 1000 fois : " + ratio1000);
    }
}
