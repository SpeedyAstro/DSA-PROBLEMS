/*
 * @author : pandeyanubhav888
 * <a href="https://codeforces.com/problemset/problem/723/A"/>
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> s = new ArrayList<Integer>();
        for(int i = 0 ; i < 3 ; i++){
            s.add(sc.nextInt());
        }
        //Collection.sort(s);
        Collections.sort(s);
        int a = s.get(0) - s.get(1);
        int b = s.get(1) - s.get(2);
        System.out.println(Math.abs(a+b));


    }
}
