package chapter7;
import java.util.*;

public class CommonCharacters {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        List<Character> commonChars = commonChars(words);

        System.out.println("Common characters: " + commonChars);
    }

    public static List<Character> commonChars(String[] words) {
        Map<Character, Integer> charFreq = new HashMap<>();

        // Initialize charFreq with the frequency of characters in the first word
        for (char c : words[0].toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Update charFreq based on other words
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> tempFreq = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                tempFreq.put(c, tempFreq.getOrDefault(c, 0) + 1);
            }

            // Update charFreq by taking the minimum frequency
            for (char c : charFreq.keySet()) {
                charFreq.put(c, Math.min(charFreq.get(c), tempFreq.getOrDefault(c, 0)));
            }
        }

        // Collect common characters
        List<Character> result = new ArrayList<>();
        for (char c : charFreq.keySet()) {
            int freq = charFreq.get(c);
            for (int j = 0; j < freq; j++) {
                result.add(c);
            }
        }

        return result;
    }
}

