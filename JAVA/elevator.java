import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int a = s.nextInt();
            int b =s.nextInt();
            int c = s.nextInt();
            b = Math.abs(c-b)+c;
            if(a<b) System.out.println(1);
            else if(b<a) System.out.println(2);
            else System.out.println(3);

        }
    }
}
