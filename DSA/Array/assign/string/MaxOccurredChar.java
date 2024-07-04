package assign.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxOccurredChar {
    public static void main(String[] args) {

        String str = "chandann";
        System.out.println(maxOccurredChar(str));


    }

    public static char maxOccurredChar(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        char maxChar=' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > maxCount){
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }

}
