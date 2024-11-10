package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,2,0,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int [] arr,int left,int right){
        if(left>=right){
            return;
        }
        int start = left;
        int end = right;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                start++; //chalte raho
            }
            while(arr[end]>pivot){
                end--; //chalte raho
            }
            //swapping condition
            if(start<=end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            //now pivot element is at the right place
        }
        //now we will recursively sort the remaining two parts of the array
        quicksort(arr,left,end);
        quicksort(arr,start,right);
    }
}
