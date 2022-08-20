import java.util.Scanner;

public class Problem1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = 0 , b = 0;
            if(m == 1 && n == 1){
                System.out.println(0);
                continue;
            }   
            // b = (m/2)+(n-1)+(m-m/2);
            // a = m-1;
            if(n>m){
                b = (m-1)+(n-1);
                a = m;
            }
            else{
                b = (n-1)+(m-1);
                a = n;

            }
            // b = (m/2+(n-1))+((m/2)+(m/2)+1)+(m/2);
            System.out.println(a+b);
            // System.out.println(b);
        }
        sc.close();
    }
}
