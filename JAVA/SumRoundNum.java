/*
 * @author : pandeyanubhav888
 * <a href="https://codeforces.com/problemset/problem/1352/A"/>
 * 
 */
import java.util.Scanner;

public class SumRoundNum {
    public static void main(String[] args) {
        int m = 1, n;
        int [] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int rpt = 0;
            t--;
            n = sc.nextInt(); 
            if(n < 10){ 
                System.out.println(1);
                System.out.println(n);
                continue;
            }
            for(int i = 0 ; i < 6 ; i++){
                arr[i] = n % 10;
                n = n / 10;
                if(arr[i] != 0 ){
                    rpt++;
                }
            }
            System.out.println(rpt);
            for(int i = 0 ; i < 6 ; i++){
                if(arr[i] != 0){
                    System.out.print(arr[i] * m + " ");
                }
                m = m * 10;
            }
            m = 1;
            //t--;
            //rpt = 0;
            System.out.println();
            sc.close();
        }
    }
}
/*
 * input :
5
5009
7
9876
10000
10
output :
2
5000 9
1
7 
4
800 70 6 9000 
1
10000 
1
10 
 */
