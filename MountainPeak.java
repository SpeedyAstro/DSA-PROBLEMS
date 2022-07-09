/*
 * An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        Input: arr = [0,1,0]
        Output: 1
    [APPROACH] - Binary Search
 */
public class MountainPeak {
    private static int PeakElement(int[] arr){
        int start = 0, end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start<end){
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
            mid = start + (end-start)/2;

        }
        return start;
    }
    public static void main(String[] args) {
        int arr [] = {3,4,5,1};
        System.out.println(PeakElement(arr));
    }
}
