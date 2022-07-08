class FirstLastEleSortedArray{
    /*
     * You have been given a sorted array/list ARR consisting of ‘N’ elements. You are also given an integer ‘K’.
Now, your task is to find the first and last occurrence of ‘K’ in ARR.
     */
    // [approach] Binary search 
    public static int FirstEle(int []arr, int key){
        int start = 0, end = arr.length-1,ans= -1;
        int mid = start+(end-start)/2;
        while(start<=end){
            if(arr[mid]== key){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]> key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
    public static int SecondEle(int []arr, int key){
        int start = 0, end = arr.length-1,ans= -1;
        int mid = start+(end-start)/2;
        while(start<=end){
            if(arr[mid]== key){
                ans = mid;
                start = mid+1;
            }
            else if(arr[mid]> key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,3,3,7,9,16};
        System.out.println(FirstEle(arr, 3));
        System.out.println(SecondEle(arr, 3));
    }
}