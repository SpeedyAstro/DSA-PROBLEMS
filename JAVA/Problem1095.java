/*
 * @author - pandeyanubhav888
 * task - remove the repeating character in particular sequence [1,2,3,4..] -[abbcccdddd] -> [abcd]
 * Problem1095 
 */
import java.util.*;
public class Problem1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), vr = 0;
        String ans="";
        String s = sc.next();
        for(int i = 0 ; vr+i < t ; i++){
            vr += i;
            ans += s.charAt(vr);
            //System.out.println(ans);
        }
        System.out.println(ans);
        sc.close();
    }
}
