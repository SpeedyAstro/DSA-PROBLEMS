import java.util.Scanner;
public class Problem268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),ans = 0;
        for(int i = 1 ; i <n ; i ++){
            ans +=(n-i)*i;
        }
        System.out.println(ans+n);
        sc.close();
    }
}
