package assign.string;

public class AnagramAndPangram {
    public static void main(String[] args) {
//        String str1 = "Silent";
//        String str2 = "Listen";

        String str1 = "Astronomer";
        String str2 = "Moon starer";

        System.out.println(isAnagram(str1, str2));

        String str3 = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str3));
    }

    public static boolean isAnagram(String str1, String str2){
        //counts the occurrence of character
        int[] charCount  = new int[26];
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //counts letters occurrence in first string
        for (int i = 0; i < str1.length(); i++) {
            if (Character.isLetter(str1.charAt(i))){
                charCount[str1.charAt(i)-'a']++;
            }
        }
        //counts letters occurrence in second string
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isLetter(str2.charAt(i))){
                charCount[str2.charAt(i)-'a']--;
            }
        }
        //check if any count is non-zero
        for (int count:charCount){
            if (count!=0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPangram(String str){
        //counts the occurrence of character
        int[] charCount  = new int[26];
        str = str.toLowerCase();

        //counts letters occurrence in string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
                charCount[ch-'a']++;
            }
        }

        //check if any count is zero
        for (int count:charCount){
            if (count==0){
                return false;
            }
        }
        return true;
    }
}
