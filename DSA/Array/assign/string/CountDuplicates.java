package assign.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicates {
    public static void main(String[] args) {
        String name = "chandan";
        printDuplicates2(name);
    }

    public static void printDuplicates(String str) {
        int[] charCount = new int[256];

        for (char ch : str.toCharArray()) {
            charCount[ch]++;
        }

//        // Count the occurrences of each character
//        for (int i = 0; i < getLength(str); i++) {
//            charCount[str.charAt(i)]++;
//        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " : " + charCount[i] + " times");
            }
        }
    }

    private static int getLength(String str) {
        System.out.println("CountDuplicates.getLength");
        return str.length();
    }

    public static void printDuplicates2(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
            }
        }

    }

    private static Set<Map.Entry<Character, Integer>> getEntries(Map<Character, Integer> charCount) {
        System.out.println("CountDuplicates.getEntries");
        return charCount.entrySet();
    }
}
