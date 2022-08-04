import java.util.ArrayList;
import java.util.Scanner;
/*
 * author : pandeyanubhav888
 * title : tram
 */
public class TramMaxPassen{
    public static void main(String[] args) {
        ArrayList<Integer> passen = new ArrayList<>();
        int maxpassenger = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int stops = sc.nextInt();
        int ans = 0;
        for(int i = 0 ; i < stops*2 ; i++){
            int passenger = sc.nextInt();
            passen.add(passenger);
        }
        for(int i = 0 ; i < stops*2 ; i++){
            if(i == 1){
                ans = passen.get(0) + passen.get(i);
            }
            else if(i > 1){
                ans = ans + passen.get(i+1) - passen.get(i);
                i++;
            }
            maxpassenger = Math.max(ans, maxpassenger);
        }
        System.out.println(maxpassenger);
        sc.close();
    }
}