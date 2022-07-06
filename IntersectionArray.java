import java.util.ArrayList;

public class IntersectionArray {
    public static ArrayList<Integer> ArrayIntersection(int [] arr, int [] arr1){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j =0;
        while(i<arr.length && j<arr1.length){
            if (arr[i] == arr1[j]) {
                ans.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i] < arr1[j]){
                i++;
            }
            else{
                j++;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 4};
        int arr1[] = {2, 2, 3, 3};
        System.out.println(ArrayIntersection(arr, arr1));
    }
}
