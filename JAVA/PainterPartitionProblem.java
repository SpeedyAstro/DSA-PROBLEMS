public class PainterPartitionProblem {
    /*
     * patition the array of board such that time required to paint is minimum
     * ther is muliple painter , allocate board such it require less time to paint the board 
     */
    private static boolean isPossible(int [] board,int pntr, int mid){
        int areaPainted = 0;
        int PainterCount = 1;
        for(int i = 0; i < board.length; i++){
            if(areaPainted + board[i] <= mid){
                areaPainted = areaPainted + board[i];
            }
            else{
                PainterCount++;
                if(PainterCount>pntr || board[i]>mid){
                    return false;
                }
            }
        } 
        return true;
    }
     private static int PartitionBoard(int [] board,int pntr){
        int start = 0,ans = -1,sum = 0;
        for (int ele : board) {
            sum = sum + ele;
        } 
        int end = sum;
        int mid = start + (end - start)/2;
        while(start<=end){
            if(isPossible(board, pntr, mid)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1 ;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }
    public static void main(String[] args) {
        int [] board = {1,2,3,4};
        int pntr = 2;
        System.out.println(PartitionBoard(board, pntr));
    }
}
