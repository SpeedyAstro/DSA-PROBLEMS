import java.util.Scanner;
public class Problem139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum = 0,count = 0;
        int [] pageperweek = new int[7];
        for(int i = 0 ; i<7;i++ ){
            pageperweek[i] = sc.nextInt();
        }
        for(int i = 0 ; sum < n;i++){
            count++;
            i = i%7;
            sum += pageperweek[i];
            //System.out.println(pageperweek[i]);
        }
        count %= 7;
        if(count == 0){
            System.out.println(7);
        }
        else
            System.out.println(count);
        sc.close();
    }
}
