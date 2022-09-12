import java.util.Scanner;

public class DecodeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            Long dcrpt = s.nextLong();
            String str = "";
            while(dcrpt>0){
                if(dcrpt%10 != 0){
                    str += Character.toString((char)(dcrpt%10)+96);
                    dcrpt /= 10;
                }else{
                    dcrpt/=10;
                    str += Character.toString((char)(dcrpt%100)+96);
                    dcrpt/=100;
                }
                
            }
            //System.out.println(str);
            char [] ch = str.toCharArray();
            String ans = "";
            for(int i = ch.length-1 ; i >=0 ; i--){
                ans += ch[i]; 
            }
            System.out.println(ans);

        }
    }
}
