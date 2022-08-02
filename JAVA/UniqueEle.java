class UniqueEle{
    /*
     * You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
     */
    public static int FindUniqueEle(int [] arr){
        int ans=0;
        for (int ele : arr) {
            ans = ele^ans; //XOR OPERATION 
        }
        return ans;
    } 
    
    public static void main(String[] args) {
        int arr[] = {2,3,1,6,3,6,2};
        int n = FindUniqueEle(arr);
        System.out.println(n);
    }
} 