package assign.string;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CountCharacter {
    public static void main(String[] args) {
        String name = "chandan44@$6i9%";
        countCharacters(name);

    }

    public static void countCharacters(String str){
        int vowels=0, cons = 0, specChar = 0;
        Set<Character> vowelsList = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (char ch:str.toCharArray()){
           if (Character.isLetter(ch)) {
               if (vowelsList.contains(ch)){
                   vowels++;
               }else {
                   cons++;
               }
           }else if(Character.isDigit(ch)){

           }else{
               specChar++;
           }
        }

        System.out.println("Vowels : "+vowels);
        System.out.println("Consonant : "+cons);
        System.out.println("Special char : "+specChar);
    }
}
