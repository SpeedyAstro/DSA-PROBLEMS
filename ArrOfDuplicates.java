import java.util.ArrayList;

public class ArrOfDuplicates {
    public static ArrayList<Integer> DuplicateFind(int[] arr){
        int occ[] = new int[arr.length+1]; // 
        ArrayList<Integer> ans = new ArrayList<>();
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
