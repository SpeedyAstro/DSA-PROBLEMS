public class RotatedArray {
    public static void main(String[] args) {
        
    }
    public static int findPivot(int [] arr){
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) /2 ;
            if(arr[mid] > arr[mid+1] && arr[mid]>start) return mid;
            else if(arr[mid] < arr[mid-1] && arr[mid]<end) return mid-1;
            if(arr[mid] == start && arr[mid] == end){
                if(arr[start]>arr[start+1]) return start;
                start--;
                if(arr[end]<arr[end-1]) return end-1;
                end--;
            }
            else if(arr[mid]>arr[start] || (arr[mid] == arr[start] && arr[mid]>arr[end])){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static int findSmallest(int [] arr){
        int start = 0 , end = arr.length-1;
        while(start<end){
            int mid = start + (end - start) /2;
            if(arr[mid]>arr[end]) start = mid +1; 
            else if(arr[mid] < arr[end]) end = mid;
        }
        return start;
    }
}
