import java.util.*;
public class SearchUsingArrayList {
    static ArrayList<Integer> allIndeices(int arr[],int n,int x,int idx) {
        if(idx>=n) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == x) {
            ans.add(idx);
        }
        ArrayList<Integer>smallAns = allIndeices(arr, n, x, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String args[]) {
        int arr [] = {1,2,4,4,4,4,6};
        // int target = 4;
        int n = arr.length;
        ArrayList<Integer> ans = allIndeices(arr, n, 4, 0);
        for(Integer i:ans) {
            System.out.print(i+" ");

        }
    }
}