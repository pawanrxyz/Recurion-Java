public class PrintTotalndexOfTarget {
    public static void printIndex(int a [],int n,int target , int idx) {
        
        if(idx>=n) {
            System.out.println("Target element is not present : ");
            return;
        }
        if(a[idx] == target) {
            System.out.print(idx+" ");
        }
        
     printIndex(a,n, target, idx+1);

    }
    public static void main(String args[]) {
        int a [] = {1,2,3,2,2,5};
        int tar = 2;
        // int ans = printIndex(a, a.length, tar, 0);
        printIndex(a, a.length, tar,0);
    }
    
}
