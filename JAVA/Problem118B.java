import java.util.Scanner;

public class Problem118B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i <= n; i++){
            for(int j = 2*n ; j >2*i;j--){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++){
                System.out.print(" "+j);
            }
            if(i!=0){
                for(int j = i-1 ; j >=0 ; j--){
                    System.out.print(" "+j);
                }
            }
            System.out.println();
        }
        for(int i = n ; i >= 0 ; i--){
            for(int j = 2*i; j>2*n;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 0; j<i*2;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0 ;)
        // }
        sc.close();
    }
}
