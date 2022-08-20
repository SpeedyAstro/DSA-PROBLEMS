import java.util.Scanner;

class Problem1720{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = sc.nextLong();
            Long d = sc.nextLong();
            if(a*d == b*c){
                System.out.println("0");
            }
            else{
                Long p1 = a*d;
                Long p2 = b*c;
                if(p2 != 0 && p1%p2 == 0){
                    System.out.println("1");
                }
                else if(p1 != 0 && p2 % p1 == 0){
                    System.out.println("1");
                }
                else{
                    System.out.println("2");
                }
            }
        }
        sc.close();
    }
}