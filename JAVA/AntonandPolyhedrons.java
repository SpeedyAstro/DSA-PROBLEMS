import java.util.Scanner;

public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                counter = counter + 4;
            }
            else if(s.equals("Cube")){
                counter += 6;
            }
            else if(s.equals("Octahedron")){
                counter += 8;
            }
            else if(s.equals("Dodecahedron")){
                counter += 12;
            }
            else if(s.equals("Icosahedron")){
                counter += 20;
            }
        }
        System.out.println(counter); 
        sc.close();
    }
}
