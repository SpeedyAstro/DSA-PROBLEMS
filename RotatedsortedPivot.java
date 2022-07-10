public class RotatedsortedPivot {
    private static int SearchBinary(int[] arr,int key,int start, int end){
        int s = start, e = end;
        int mid = s + (e-s)/2;
        while(s<e){
            if(arr[mid] == key){
                return s;
            }
            else if(arr[mid]>key){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
    private static int SearchPivot(int[] arr){
        int start = 0, end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start<=end){
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
            return SearchBinary(arr, key,pivot,n);
        }
        else{
            return SearchBinary(arr, key, 0, pivot-1);
        }
    }
    public static void main(String[] args) {
        
    }
}
