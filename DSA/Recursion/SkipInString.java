public class SkipInString {
    public static void main(String[] args) {

        String str = "advfgavdadd";
        String str1 = "advfapplegavdadd";
        String str2 = "advfappgavdadd";
        System.out.println(skip(str));
        System.out.println(skipapple(str1));
        System.out.println(skipappNotapple(str1));
        System.out.println(skipappNotapple(str2));
    }

    public static String skip(String str){

        if (str.isEmpty()) {
            return "";
        }

        if (str.charAt(0) == 'a') {
            return skip(str.substring(1));
        } else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }

    public static String skipapple(String str){

        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipapple(str.substring(5));
        } else {
            return str.charAt(0) + skipapple(str.substring(1));
        }
    }

    public static String skipappNotapple(String str){

        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipappNotapple(str.substring(3));
        } else {
            return str.charAt(0) + skipappNotapple(str.substring(1));
        }
    }
}
