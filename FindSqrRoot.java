class FindSqrRoot{
    private static int SearchSqrRoot(int []arr , int key){
        int start = 0,end = arr.length-1,ans=0;
        int mid = start + (end-start)/2; 
        while(start<=end){
            if(arr[mid]*arr[mid] == key){
                ans = arr[mid];
                return ans;
            }
            else if (arr[mid]*arr[mid] < key){
                ans = arr[mid];
                start = mid + 1;
            }
            else if(arr[mid]*arr[mid]> key){
                end = mid -1;
            }
            mid = start+(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(SearchSqrRoot(arr, 25));
    }
}