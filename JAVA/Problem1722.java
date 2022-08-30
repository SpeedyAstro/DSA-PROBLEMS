import java.util.Arrays;
import java.util.Scanner;

public class Problem1722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String s1 = "Timur";
        char [] c = s1.toCharArray();
        while(tc--> 0){ 
            int n = sc.nextInt();
            String s = sc.next();
            char c1 [] = s.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c);
            if(Arrays.equals(c1, c)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
// int n = sc.nextInt();
//             String s = sc.next();
//             if(s.contains("T") && s.contains("m")&&s.contains("i")&&s.contains("u")&&s.contains("r")&&n==s1.length()){
//                 System.out.println("Yes");
//             }else{
//                 System.out.println("No");
//             }