import java.util.Scanner;
/*
 * Dreamoon wants to climb up a stair of n steps. He can climb 1 or 2 steps at each move. Dreamoon wants the number of moves to be a multiple of an integer m.
 * What is the minimal number of moves making him climb to the top of the stairs that satisfies his condition?
 * Maximum number of moves possible - 1,1,1,1,1,1,1,1,...
 * Minimum number of moves possible - n/2;
 * approach:
 * incrementing n/2 to until it is divisible by m 
 * 
 */
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
        sc.close();
    }
}
