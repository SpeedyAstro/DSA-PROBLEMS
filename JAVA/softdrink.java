/*
 * @author - pandeyanubhav888
 * <a href="https://codeforces.com/problemset/problem/151/A"/>
 * <title - Soft Drink>
 */
import java.util.Scanner;


public class softdrink { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // k number of bottles
        int l = sc.nextInt(); // l milliliter of drink
        int c = sc.nextInt(); // limes
        int d = sc.nextInt(); // slice of each limes
        int p = sc.nextInt(); // salt
        int nl1 = sc.nextInt();
        int np2 = sc.nextInt();
        int slice = 1; // acc to question slice will consume only 1 always
        int ans = 0;
        // to make a toast total 
        int totdrink = k*l;
        totdrink = totdrink/nl1; // total shots 
        int totsclice = c*d;
        int totsalt = p/np2;
        ans = Math.min(Math.min(totdrink,totsclice),totsalt) / n;
        System.out.println(ans);

    }
}
