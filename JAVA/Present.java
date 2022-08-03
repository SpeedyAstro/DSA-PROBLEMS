import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int friends[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            int frnd = sc.nextInt();
            friends[frnd] = i;
        }
        for(int i = 1 ; i <= n ; i++){
            System.out.print(friends[i] + " ");
        }
        sc.close();
    }
}
