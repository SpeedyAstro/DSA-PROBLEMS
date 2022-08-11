import static java.lang.System.out;
import java.util.*;

 
class Problem1433{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,11,111,1111};
        int tc = sc.nextInt();
        for(int i = 0 ; i < tc ; i++){
            int count = 0;
            int n = sc.nextInt();
            outerloop:
            for(int j = 1 ; j <= 9; j++){
                for(int k = 1 ; k <= 4 ; k++ ){
                    if(j*arr[k-1] == n){
                        count += k;
                        break outerloop;
                    }
                    else
                        count+=k;
                }
            }
            out.println(count);
        }
        sc.close();
    }
}