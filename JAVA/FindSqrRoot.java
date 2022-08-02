class FindSqrRoot{
    private static int SearchSqrRoot(int []arr , int key){
        int start = 0,end = arr.length-1,ans=-1;
        int mid = start + (end-start)/2; 
        while(start<=end){
            int sqr = arr[mid]*arr[mid];
            if(sqr == key){
                ans = arr[mid];
                return ans;
            }
            else if (sqr < key){
                ans = arr[mid];
                start = mid + 1;
            }
            else if(sqr > key){
                end = mid -1; 
            }
            mid = start+(end-start)/2;
        }
        return ans;
    }
    private static double GetPrecision(int n,int temp,int precision){
        double factor = 1;
        double ans = temp;
        for(int i = 0;i<precision;i++){
            factor = factor / 10;
            for(double j = ans;j*j<=n;j= j+factor){
                ans = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(SearchSqrRoot(arr, 26));
        int tempSol = SearchSqrRoot(arr, 101);
        System.out.println(GetPrecision(101, tempSol, 6));
    }
}