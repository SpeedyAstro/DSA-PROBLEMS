import java.util.Arrays;

public class DuplicateEle {
    public static int FindDuplicate(int [] arr){
        int ans =0;
        for(int ele:arr){
            ans = ans ^ ele; //XOR Operation
        }
        for(int i=1;i<arr.length;i++){  //[1,n-1]
            ans = ans ^ i;
        }
        return ans;
    }
        public int findDuplicate(int[] nums) { 
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1])
                    return nums[i];
            }
    
            return -1;
        }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5};
        int n = FindDuplicate(arr);
        System.out.println(n);
    }
}
