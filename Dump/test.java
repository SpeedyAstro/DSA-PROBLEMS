
public class test {
    public static void main(String[] args) {
        int [] arr = {5,7,8,8,10};

        int ans = lwrBnd(arr, 8);
        int ans1 = uprBnd(arr, 8);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public static int lwrBnd(int arr[] , int target){
        int ans=-1 ;
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) /2 ;
            if(arr[mid] == target){
                ans = mid;
                end = mid -1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }
    public static int uprBnd(int [] arr, int target){
        int start = 0 , end = arr.length-1;
        int ans  = -1;
        while(start<=end){
            int mid = start + (end - start) /2 ;
            if(arr[mid] == target){
                ans = mid;
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }
}
