import java.util.Scanner;

public class Problem476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x=-1;
        if(n<m){
            x = -1;
        }
        else{
            if(n%2 == 0){
                x = n/2;
            }
            else if(n%2 !=0){
                x = (n+1)/2;
            }
            while(x%m != 0){
                x++;
            }
        }
        System.out.println(x);
    }
}
