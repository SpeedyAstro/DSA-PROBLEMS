import java.util.Scanner;

public class WordCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char result [] = s.toCharArray();
        char uppercase = Character.toUpperCase(result[0]);
        result[0] = uppercase;
        s = new String(result);
        System.out.println(result);
        sc.close();
    }
}
