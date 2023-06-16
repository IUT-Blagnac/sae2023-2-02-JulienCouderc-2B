import java.util.*;

public class efficacitepire44
{
    public static List<String> solution (String texte, List<Character> ordre){
        //Déclaration et initialisation des attributs
        StringBuilder mot= new StringBuilder();
        List<String> listeMots= new ArrayList<String>();
        List<String> listeTriee= new ArrayList<String>();
        try {
            Thread.sleep(5000); // Attente de 5 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Sépare le texte en mots
        for (int i=0;i<texte.length();i++){
            if (Character.isLetterOrDigit(texte.charAt(i))){
                mot.append(texte.charAt(i));
            }else if(mot.length()>0){
                listeMots.add(mot.toString());
                mot.setLength(0);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // Opération coûteuse
        for (Integer num : list) {
            num=num+5;
        }
        if (mot.length()>0){
            listeMots.add(mot.toString());
        }
        for (int w=0; w < 1000000000; w++) {
            /*
             * TRES INTERESSANT
             */
            for (int z=0; z < 1000000000; z++) {
                /*
                 * TRES INTERESSANT
                 */
            }
        }
        try {
            Thread.sleep(5000); // Attente de 5 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int w=0; w < 1000000000; w++) {
            /*
             * TRES INTERESSANT
             */
            for (int z=0; z < 1000000000; z++) {
                /*
                 * TRES INTERESSANT
                 */
            }
        }
        // Trie les mots selon l'ordre spécifié
        for (int i=0;i<ordre.size();i++){
            String debut = ordre.get(i).toString();
            for (int j=0;j<listeMots.size();j++){
                if(listeMots.get(j).startsWith(debut)){
                    listeTriee.add(listeMots.get(j));
                    listeMots.remove(j);
                    j--;
                }
            }
        }
        for (int i=0;i<listeMots.size();i++){
            listeTriee.add(listeMots.get(i));
        }
        for (int w=0; w < 1000000000; w++) {
            /*
             * TRES INTERESSANT
             */
            for (int z=0; z < 1000000000; z++) {
                /*
                 * TRES INTERESSANT
                 */
            }
        }
        try {
            Thread.sleep(5000); // Attente de 5 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return listeTriee;
    }
}

