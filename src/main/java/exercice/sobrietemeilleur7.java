package exercice;

import java.util.List;
import java.util.LinkedList;

public class sobrietemeilleur7 {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> result = new LinkedList<>();

        int start = 0;
        int end = 0;
        int len = str.length();

        while (end < len) {
            char currentLetter = str.charAt(end);
            
            if (ordre.contains(currentLetter)) {
                end++;
            } else {
                if (start != end) {
                    result.add(str.substring(start, end));
                }
                start = ++end;
            }
        }

        if (start != end) {
            result.add(str.substring(start, end));
        }

        return result;
    }
}
