import java.util.Scanner;

class FoxAndSnake{
    /*
    * @author : pandeyanubhav888
     * to draw a snake on a table [nxm]
     * Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][] table = new char[n][m];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                if((i+1)%2 != 0){
                    table[i][j] = '#';
                }
                else{
                    k = (i+1)/2;
                    if(k%2 != 0 && j == m-1){
                        table[i][j] = '#';
                    }
                    else if (k%2 == 0 && j == 0){
                        table[i][j] = '#';
                    }
                    else{
                        table[i][j] = '.';
                    }
                }
            }
        }
        //System.out.println(table[1][1]);
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
 * input - 
 * 9 9
 * 
 * output -
 * #########
 * ........#
 * #########
 * #........
 * #########
 * ........#
 * #########
 * #........
 * #########
 
 */