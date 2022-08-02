import java.util.ArrayList;
import java.util.*;

public class AggresiveCows {
    private static boolean isPossible(ArrayList<Integer> stall,int cows, int mid){
        int CowCount = 1;
        int lastPos = stall.get(0);
        for(int i = 0;i < stall.size(); i++){
            if(stall.get(i)-lastPos >=mid ){
                CowCount++;
                if(CowCount==cows){
                    return true;
                }
                lastPos = stall.get(i); 
            }
        }
        return false;
    }
    private static int FindStalls(ArrayList<Integer> stall,int Cows){
        int start = 0,ans = -1;
        Collections.sort(stall);
        int n = stall.size()-1;
        int end = stall.get(n)-1;
        int mid = start + (end-start)/2;
        while(start<=end){
            if(isPossible(stall,Cows,mid)){
                ans = mid;
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> stall = new ArrayList<>();
        stall.add(4);
        stall.add(2);
        stall.add(1);
        stall.add(3);
        stall.add(6);
        int cows = 3;
        System.out.println(FindStalls(stall, cows));
    }
}
