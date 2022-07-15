/*
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
 */
import java.util.ArrayList;

public class ArrOfDuplicates {
    public static ArrayList<Integer> DuplicateFind(int[] arr){
        int occ[] = new int[arr.length+1]; // array keep the occurance of element 
        ArrayList<Integer> ans = new ArrayList<>(); // Arraylist 
        for(int i = 0;i < arr.length;i++){
            occ[arr[i]]++;
        }
        for(int i = 0; i < occ.length; i++){
            if (occ[i]>1) {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(DuplicateFind(arr)); 
    }
}
