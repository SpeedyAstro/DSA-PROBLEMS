public class DuplicateEle {
    public static int FindDuplicate(int [] arr){
        int ans =0;
        for(int ele:arr){
            ans = ans ^ ele;
        }
        for(int i=0;i<arr.length;i++){
            ans = ans ^ i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5};
        int n = FindDuplicate(arr);
        System.out.println(n);
    }
}
