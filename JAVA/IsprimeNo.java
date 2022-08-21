import java.util.Scanner;
public class IsprimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 2;
        boolean b = true;
        while (c*c <= n) {
            if(n%c == 0){
                b = false;
                break;
            }
            c++;
        }
        if(b){
            System.out.println(n+ " is a prime number!");
        }
        else{
            System.out.println(n + " is not a prime number!");
        }
        
    }
}