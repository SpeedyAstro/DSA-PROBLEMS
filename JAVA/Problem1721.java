import java.util.ArrayList;
import java.util.Scanner;

public class Problem1721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String s = sc.next();
            int ans = 0;
            int max = -1 , count = 1;
            s += sc.next();
            char [] c = s.toCharArray();
            int count1[] = new int[126];
            ArrayList list = new ArrayList<>();
            for(int i=0 ; i < c.length; i++){
                count1[c[i]]++;
            }
            for(int i = 0; i < count1.length; i++){
                if(count1[i] >= 1){
                    list.add(count1[i]);
                }
            }
            if(list.contains(3)&& list.contains(1) && list.size() == 2){
                    ans = 1 ;
                }else{
                    ans = list.size()-1;
                }
                System.out.println(ans);
            // System.out.println(list);
            
        }
        sc.close();
    }
}
// for(int i = 0 ; i < c.length; i++){
    //     for(int j = i+1;j < c.length ; j++){
    //         if(c[i]==c[j]){
    //             count++;
    //         }
    //     }
    //     list.add(count);
    //     count = 0;
    // }
    // if(list.contains(3)&& list.contains(1) && list.size() == 2){
            //     ans = 2;
            // }else{
            //     ans = list.size()-1;
            // }
            // System.out.println(ans);