package strings;

import java.util.ArrayList;

public class SubSetReturn {
    public static void main(String[] args) {
        System.out.println(subseqreturn("","abc"));
    }
    static ArrayList<Integer> subsetreturn(int[] processed,int[] unprocessed) {
        if(unprocessed.length==0) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(processed[0]);
            return list;
        }
        int i = unprocessed[0];

        ArrayList<Integer> left = subsetreturn(processed,unprocessed.substring(1));
        ArrayList<Integer> right = subsetreturn(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
