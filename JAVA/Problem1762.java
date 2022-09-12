// Failed
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem1762 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        while (tc-->0) {
            int ans = 0;
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            ans = arr[n-1]-arr[0];
            System.out.println(ans);
        }
    }
}
