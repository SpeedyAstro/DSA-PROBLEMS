import java.util.Scanner;

public class BookAllocation {
    private static boolean isPossible(int []arr, int n, int m , int mid){
        int PageSum = 0;
        int studentCount = 1;
        for(int i=0;i<m;i++){
            if(PageSum+arr[i] <= mid){
                PageSum = PageSum + arr[i];
            }
            else{
                studentCount++;
                if(studentCount>n || arr[i]>mid){
                    return false;
                }
                PageSum = arr[i];
            }
        }
        return true;
    }
    private static int AllocateBook(int[] arr, int m, int n ){
        int start = 0,sum=0,ans = -1;
        for(int i:arr){ sum = i + sum;}
        int end = sum;
        int mid = start + (end-start)/2;
        while(start<=end){
            if(isPossible(arr, n,m,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid +1;
            }
            mid = start + (end-start)/2;
        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr = {30,10,60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student for book allocation");
        int n = sc.nextInt();
        int m = arr.length; //number of books
        System.out.println(AllocateBook(arr, m, n));

    }
}
