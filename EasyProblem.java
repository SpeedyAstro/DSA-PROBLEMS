import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int response = sc.nextInt();
            ans += response;
        }
        if(ans >= 1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
