package strings;

import java.util.ArrayList;

public class SubSeqReturn {
    public static void main(String[] args) {
        System.out.println(subseqreturn("","abc"));
    }
    static ArrayList<String> subseqreturn(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> left = subseqreturn(processed+ch,unprocessed.substring(1));
        ArrayList<String> right = subseqreturn(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
