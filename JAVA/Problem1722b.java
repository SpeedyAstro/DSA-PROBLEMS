import java.util.Scanner;

public class Problem1722b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int col = sc.nextInt();
            String s = sc.next();
            String s1 = sc.next();
            char[] c = s.toCharArray();
            boolean b = false;
            char [] c1 = s1.toCharArray();
            for(int i = 0 ; i<col;i++){
                if(c[i] == c1[i] || (c[i] == 'G'&& c1[i] == 'B')|| (c[i] == 'B'&& c1[i] == 'G')){
                    b = true;
                }else{
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
