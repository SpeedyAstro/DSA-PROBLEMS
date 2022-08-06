import java.util.Arrays;
import java.util.Scanner;

public class BoyorGirl {
    static void removeDuplicate(String str){
        int index = 1 , index2 = 1;
        char arr[] = str.toCharArray();
        while(index != arr.length){
            if(arr[index] != arr[index-1]){
                arr[index2] = arr[index];
                index2++;
            }
            index++;
        }
        str = new String(arr);
        //System.out.println(str.substring(0, index2));
        str = str.substring(0, index2);
        //System.out.println(str.length());
        if(str.length() %2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
    static String sortmyString(String str){
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String newstr = sortmyString(name);
        removeDuplicate(newstr);

    }
}
