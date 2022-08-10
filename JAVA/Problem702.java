import java.util.Scanner;

public class Problem702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int counter = 0, ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        if(n == 1){
            ans = 1;
        }
        else{
            for(int i = 1 ; i < n ; i++){
                if(arr[i-1] <= arr[i])
                {
                    if(arr[i-1] == arr[i]){
                        counter = 0;
                    }
                    else{
                        counter++;
                    }
                }
                else{
                    counter = 0;
                }
            ans = Math.max(ans, counter+1);
            }
        }
        
        sc.close();
        System.out.println(ans);
    }
}