import java.util.*;
public class Problem1141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt() , res = -1,d;
        if(k % n == 0){
            res  = 0;
            d = k /n;
            while(d % 2 == 0){
                d /= 2 ;
                res ++;
            }
            while(d % 3 == 0){
                d /= 3;
                res++;
            }
            if(d!=1){
                res = -1;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
