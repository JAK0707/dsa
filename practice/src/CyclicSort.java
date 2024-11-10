import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            //basically yaha arr[i] waali value apne correct index par jaa rhi hai
            if(arr[i]!=arr[correctIndex]){
                swap(arr , i , correctIndex);
            }
            else i++;
        }
    }
    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
