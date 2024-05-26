import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {

        String str = "abc";
//        printSubSeq("", str);

        System.out.println(subSeq2("", str));
    }

    public static void printSubSeq(String p, String up){

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubSeq(p+ch, up.substring(1));
        printSubSeq(p, up.substring(1));
    }

    public static List<String> subSeq(String p, String up){

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        List<String> left = subSeq(p + ch, up.substring(1));
        List<String> right = subSeq(p, up.substring(1));

        left.addAll(right);
        return  left;
    }

    public static List<String> subSeq2(String p, String up){

        ArrayList<String> list = new ArrayList<>();

        return helper(p, up, list);

    }

    public static List<String> helper(String p, String up, List<String> ans){

        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        helper(p + ch, up.substring(1), ans);
        helper(p, up.substring(1), ans);

       return ans;
    }

}
