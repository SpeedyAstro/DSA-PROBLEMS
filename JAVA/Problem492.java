import java.util.Scanner;

public class Problem492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cubes = sc.nextInt();
        int height = 0 , n =0, ans = 0;
        for(int i = 1 ; i <= cubes ;i++){
            if(cubes == 1){
                height = 2;
                break;
            }
            else if(ans<=cubes){
                n = n +i;
                ans = ans + n;
                height++;
                //System.out.println(n);
            }
        }
        System.out.println(height-1);
    }   
}
