import java.util.Scanner;

public class NearlyLuckyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        long n = sc.nextLong();
        while(n!=0){
            if(n%10 == 4 || n%10 == 7){
                count++;
                n = n/10;
            }
            else{
                n = n/10;
            }
           // continue;
        }
        if(count ==4 || count == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
