import java.util.Scanner;

public class Problem1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = sc.nextLong();
            Long f = -1L , s = -1l;
            /*
             * shop 1 = 1 donut a price
             * shop 2 = b donut c price
             * a = 5 , b = 10 , c = 4
             * 
             */
            if(a<c){
                f = 1L;
            }
            if(a*b>c){
                s = b;
            }
            System.out.println(f+" "+s);

        }
        sc.close();
    }
}
