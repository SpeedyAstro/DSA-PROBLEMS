import java.util.Scanner;

public class Problem339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = "";
        int count1 = 0 , count2 = 0 , count3 = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count1++;
            }
            else if(s.charAt(i) == '2'){
                count2++;
            }
            else if(s.charAt(i) == '3'){
                count3++;
            }
        }
        for(int i = 0 ; i < count1 ; i++){
            result = result + "1+";
        }
        for(int i = 0 ; i < count2 ; i++){
            result = result + "2+";
        }
        for(int i = 0 ; i < count3 ; i++){
            result = result + "3+";
        }
        result = result.substring(0, s.length());
        System.out.println(result);
        sc.close();
    }
}
