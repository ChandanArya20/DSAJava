package assign.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String name = "chandan";
        System.out.println(removeDuplicates(name));
    }

    public static String removeDuplicates(String str){
        Set<Character> uniqueElem = new LinkedHashSet<>();

        for (char ch:str.toCharArray()){
            uniqueElem.add(ch);
        }

        StringBuilder temp = new StringBuilder();
        for (Character ch:uniqueElem){
            temp.append(ch);
        }

        return temp.toString();
    }
}
