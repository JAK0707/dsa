package Leetcode;

import java.util.Arrays;

public class lc34 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,8,8,8,9,10};
        int target = 8;
        int[] arr2 = {-1,-1};
        int start = searchRange(arr , target , true);
        int end = searchRange(arr , target , false);
        arr2[0] = start;
        arr2[1] = end;
        System.out.println(Arrays.toString(arr2));

    }
    static int searchRange(int[] nums, int target,boolean choice){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(choice){
                    end = mid-1;
                }
                else start = mid + 1;
            }
        }
        return ans;
    }
}
