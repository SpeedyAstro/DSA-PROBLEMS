import java.util.*;
public class Problem118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String s1 = "";
        s1 = s.replaceAll("[aoyeui]", "");
        //char c [] = s1.toCharArray();
        String ans = "";
        for(int i = 0 ; i < s1.length();i++){
            ans += "."+s1.charAt(i);
        }
        //System.out.println(s1);
        System.out.println(ans);
        sc.close();
    }
}
