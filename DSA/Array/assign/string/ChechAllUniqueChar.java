package assign.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChechAllUniqueChar {
    public static void main(String[] args) {

        String[] testCases = {
                "abcdef",    // true
                "hello",     // false
                "world",     // true
                "java",      // false
                "unique",    // true
                "123456",    // true
                "112233",    // false
        };

        // Test isAllUnique method
        System.out.println("Testing isAllUnique:");
        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isAllUnique(testCase));
        }

        // Test isAllUnique2 method
        System.out.println("Testing isAllUnique2:");
        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isAllUnique2(testCase));
        }

        // Test isAllUnique3 method
        System.out.println("Testing isAllUnique3:");
        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isAllUnique3(testCase));
        }
    }

    public static boolean isAllUnique(String str) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllUnique2(String str) {
        Set<Character> charSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!charSet.add(ch)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllUnique3(String str) {

        for (int i = 0; i < str.length() - 1; i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

}
