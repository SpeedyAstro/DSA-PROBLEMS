// Approach - binary Search
public class PivotEle {
    private static int FindPivot(int [] arr ){
        int start = 0, end = arr.length;
        int mid = start + (end-start)/2;
        while(start<end){
            if (arr[mid] >= arr[0]) {
                start = mid +1 ;
            } 
            else{
                end = mid;
            }
            mid = start + (end-start)/2;
        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr = {3,8,10,17,1};
        System.out.println("Pivot Element is at : "+FindPivot(arr)+"\nValue : "+ arr[FindPivot(arr)]);
    }
}
