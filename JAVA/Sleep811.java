/*
 * Sleep time until an alarm triggered
 * @author : pandeyanubhav888
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Sleep811 {
    public static void main(String[] args) {
        ArrayList<Integer> SleepTime = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0 ; j < n ; j++){
            int total_sleep_minutes = Integer.MAX_VALUE;
            int alarm = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            for(int i= 0 ; i < alarm ; i++){    
                int mn = 0;
                int hi = sc.nextInt();
                int mi = sc.nextInt();
                if(h < hi){
                    int total_min = h*60+m;
                    int total_min1 = hi*60+mi;
                    mn = total_min1 - total_min;
                }
                else if(h == hi){
                    if(m<=mi){
                        mn = mi - m;
                    }
                    else{
                        mn = 24 * 60 - (h * 60 + m) + hi*60+mi ;
                    }
                }
                else{
                    mn = 24*60 - (h*60+m) + (hi*60+mi);
                }
                total_sleep_minutes = Math.min(total_sleep_minutes , mn);
            }
            SleepTime.add(total_sleep_minutes/60);
            SleepTime.add(total_sleep_minutes%60);
            //System.out.println(total_sleep_minutes/60 + " " + total_sleep_minutes%60);
            
        }
        for(int i = 0 ; i < n*2 ; i++){
            System.out.println(SleepTime.get(i)+ " " + SleepTime.get(i+1));
            i++;
        }
        //System.out.println(SleepTime);
        
        sc.close();
    }
}
