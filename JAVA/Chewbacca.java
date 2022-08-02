/*
 * @author - pandeyanubhav888
 * <a href = "https://codeforces.com/contest/514/problem/A"/>
 * 
 */
import java.util.*;

public class Chewbacca{
    public static int changeDigit(char t){
        return '9' - t + 48;  //48 - '0'
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char  x[]  = new char[20],y;
        x = s.toCharArray();
        for(int i = 0 ; i < s.length(); i++){
            if(i == 0){
                if(x[i] == '9') //The decimal representation of the final number shouldn't start with a zero.
                    continue;
            }
            y = (char) changeDigit(x[i]);
            if(x[i]>y) // transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits
                x[i] = y;
        }
        System.out.println(x);
    }
}