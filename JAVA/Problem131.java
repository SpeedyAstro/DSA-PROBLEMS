import java.util.Scanner;

public class Problem131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = s.toUpperCase();
        String s2 = s.substring(0,1).toLowerCase()+s.substring(1,s.length()).toUpperCase();
        if(s.equals(s2)){
            s = s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
            System.out.println(s);
        }
        else if(s1.equals(s)){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s);
        }
        sc.close();
    }
}
