public class floor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8};
        int target = 7;
        int result = floor_num(arr,target);
        System.out.println(result);
    }
    static int floor_num(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return mid; //answer found
            }
        }
        return end;
    }
}
