package assign.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRpeatChar {
    public static void main(String[] args) {
        String str = "chandacn";

        System.out.println(firstNonRepeatingCharacter(str));
    }

    public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no non-repeating character is found, return 0
        return 0;
    }
}
