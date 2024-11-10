public class firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(yo(arr));

    }
    static int yo(int[] arr){
        int i=0;

        //cyclic sort
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }

        //search for missing number

        //case 1
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }

        //case 2
        return arr.length + 1;
    }
    static void swap(int[] arr, int i, int b){
        int temp = arr[i];
        arr[i] = arr[b];
        arr[b] = temp;
    }
}
