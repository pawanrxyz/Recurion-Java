public class CheckTarUsingRecursion {
    public static boolean search(int a [],int n,int target , int idx) {
        if(idx>=n) {
            return false;
        }
        if(a[idx] == target) {
            return true;
        }
        return search(a,n, target, idx+1);

    }
    public static void main(String args[]) {
        int a [] = {2,4,8,6,1};
        int tar = 2;
        if(search(a,a.length, tar,0)) {
            
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}