public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int ans = test.findPos(arr,10);
        System.out.println(ans);
    }

}
class test {
    public static int binarySearch(int [] arr , int start  , int end, int target){
        int mid;
        while(start<end){
            mid = start + (end -start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){
                start = mid +1 ;
            }else{
                end = mid;
            }
        }
        return -1;
    }
    public static int findPos(int [] arr , int target){
        int start = 0 , end = 1;
        while(target>arr[end]){
            int temp = end;
            end += (end - start)*2;
            start = temp;
        }
        return binarySearch(arr, start, end, target);
    }
}