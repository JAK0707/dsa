package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc78 {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsets(arr, 0, new ArrayList<>());
        System.out.println(res); // Print the result to verify
    }

    public static void subsets(int[] arr, int index, ArrayList<Integer> inner) {
        if (index == arr.length) {
            res.add(new ArrayList<>(inner)); // Add a copy of inner
            return;
        }

        // Pick case
        inner.add(arr[index]);
        subsets(arr, index + 1, inner);

        // Backtrack by removing the last added element
        inner.remove(inner.size() - 1);

        // No-pick case
        subsets(arr, index + 1, inner);
    }
}
