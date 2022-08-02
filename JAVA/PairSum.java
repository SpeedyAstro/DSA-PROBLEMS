import java.util.ArrayList;
public class PairSum {
    public static  ArrayList<Integer> SumPair(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == n){
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,2,8};
        System.out.println(SumPair(arr, 10));
    }
}

