// @failed
import java.util.Scanner;
public class Problem1430i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int num[] = new int[n+1];
            for(int i = 1 ; i <=n ; i++){
                num[i] = i;
            }

            while(n!=0){
                int a , b;
                if(n==2){
                    a = num[n];
                    b = num[1];
                }
                else{
                    a = num[(num[1] + num[n])/2];
                    b = num[n];
                }
                System.out.println(a + " " +b);
                num[(num[1]+n)/2] = (a+b)/2;
                n = n -1;
                // System.out.println(b);
            }
            // System.out.println(n);
        }
        sc.close();

    }
}
