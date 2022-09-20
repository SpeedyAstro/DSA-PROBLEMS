public class Ceiling {
    public static void main(String[] args) {
        int [] arr = {2,3,5, 9 ,14,16,18};
        int ans = BinarySearch(arr, 18);
        System.out.println(ans);
    }
    public static int BinarySearch(int []arr , int target){
        int start = 0 , end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)  / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid;
            }
            else{
                start = mid +1 ;
            }
        }
        return end;
    }
}
