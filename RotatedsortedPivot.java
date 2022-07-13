/*
 * find element in rotated and sorted array
 * -> 1) find pivot element
 * -> 2) check if target element is less than pivot or greater than 
 * -> 3) then go for binary search as per the conditon
 */
public class RotatedsortedPivot {   //Binary Search
    private static int SearchBinary(int[] arr,int key,int start, int end){
        int s = start, e = end;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return -1;
    }
    private static int SearchPivot(int[] arr){
        int start = 0, end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start<end){
            if(arr[mid]>arr[0]){
                start = mid+1;
            }
            else{
                end = mid;
            }
            mid = start + (end-start)/2;
        }
        return start;
    }
    private static int FindKey(int[] arr, int key){
        int pivot = SearchPivot(arr);
        int n = arr.length-1;
        if(key >= arr[pivot] && key <= arr[arr.length-1]){
            // BS ON SECOND LINE
            return SearchBinary(arr, key,pivot,n);
        }
        else{
            // BS ON FIRST LINE
            return SearchBinary(arr, key, 0, pivot-1);
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,8,1,3,5};
        System.out.println(FindKey(arr, 5));
    }
}
