import java.util.Scanner;

public class ArriavalGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0 , min = 0 , max_value = 0, min_value = Integer.MAX_VALUE;
        for(int i = 1 ; i <= n ; i++){
            int soldier = sc.nextInt();
            if(max_value<soldier){
                max = i; 
                max_value = soldier;
            }
            if(min_value>=soldier){
                min = i;
                min_value = soldier;
            }
        }
        if(max>min){
            System.out.println((max-1)+(n-min)-1);
        }
        else{
            System.out.println((max-1)+(n-min));
        }
        sc.close();
    }
}
