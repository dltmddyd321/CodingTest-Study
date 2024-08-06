import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> result = new ArrayList<>();
    public static List<Character> vowels = List.of('A', 'E', 'I', 'O', 'U');
    
    public static void check(String currentWord) {
        if (currentWord.length() <= 5) {
            if (!currentWord.isEmpty()) {
                result.add(currentWord);
            }
            for (Character vowel : vowels) {
                check(currentWord + vowel);
            }
        }
    }

    public static int solution(String word) {
        check("");
        return result.indexOf(word) + 1;
    }
}