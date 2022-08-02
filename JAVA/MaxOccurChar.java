import java.util.Scanner;
//Finding Maximum repeated character
public class MaxOccurChar {
    public static void FindMaxChar(String s){
        s = s.replaceAll("\\s", ""); // remove space in the string [thisisdemo]
        int  arr[] = new int[127],max = -1; // 127 printable character in ascii format
        char c = ' ';
        for(int i = 0 ; i < s.length(); i++){
            arr[s.charAt(i)] += 1;
            if(max<arr[s.charAt(i)])
            {
                max = arr[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println("Maximum Occuring Character is : "+c);
        System.out.println("Number of times occured : "+max);
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        FindMaxChar(s);
        sc.close();
    }
}
