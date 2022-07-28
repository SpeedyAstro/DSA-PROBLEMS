import java.util.*;
public class A_Bit {
    public static void main(String[] args){
        int X = 0, i , n;
        String s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 0 ; i < n ; i++){
            s = sc.next();
            if(s.charAt(1) == '+'){
                X++;
            }
            else{
                X--;
            }
        }
        System.out.println(X);
    }
}
