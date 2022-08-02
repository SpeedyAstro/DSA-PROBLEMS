import java.util.Scanner;
public class SpojEko {
    private static boolean isPossible(int[] trees, int mid,int n,int m){
        int Wood = 0;
        for(int i = 0; i < n ; ++i){
            if(trees[i] >= mid){
                Wood += (trees[i] - mid); 
            }
        }
        return Wood>= m;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] trees = new int[n];
        int m = sc.nextInt();
        for(int i = 0;i<n;++i){
            trees[i] = sc.nextInt(); 
        }
        int low = 0, high = 1000;
        int mid = (low+high)/2;
        while(high - low > 1){
            mid = (low+high)/2;
            if(isPossible(trees,mid,n,m)){
                low = mid;
            }
            else{
                high = mid - 1;
            }
        }
        if(isPossible(trees, high, n, m)){
            System.out.println(high);
        }
        else{
            System.out.println(low);
        }
    }
}
