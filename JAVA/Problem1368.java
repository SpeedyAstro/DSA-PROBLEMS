import java.util.Scanner;

public class Problem1368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , n;
        int tc = sc.nextInt();
        for(int i = 0 ; i < tc ; i ++){
            int counter = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            while((a+b)<=n){
                counter++;
                if(a>= b){
                    b += a;
                    continue;
                }
                else if(b>a){
                    a += b;
                    continue;
                }
            }
            //System.out.println(a + "\t" + b);
            System.out.println(counter+1);
        }
        sc.close();
    }
}
