public class ReturnTarget {
    public static int findIndex(int a [],int n,int target , int idx) {
        if(idx>=n) {
            System.out.println("Target element is not present : ");
            return -1;
        }
        if(a[idx] == target) {
            return idx;
        }
        return findIndex(a,n, target, idx+1);

    }
    public static void main(String args[]) {
        int a [] = {2,4,8,6,1};
        int tar = 7;
        int ans = findIndex(a, a.length, tar, 0);
        System.out.println("Target found at index : "+ans);
    }
    
}
