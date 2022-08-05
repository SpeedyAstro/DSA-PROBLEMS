import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class BearAndBigBro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year =1 ;
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        while(true){
            limak *= 3;
            bob *= 2;
            if(limak>bob){
                System.out.println(year);
                break;
            }
            year++;
        }
        sc.close();
    }
}
