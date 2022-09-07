public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {0,10,5,3,2,1};
        int start = 0 , end = arr.length-1;
        int mid;
        while (start<end){
            mid = start + (end - start) /2 ;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
        }
        System.out.println(start);
    }
    // public static int 
}
