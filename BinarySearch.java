import java.util.Scanner;
public class BinarySearch {
    public static int search(int arr[],int k,int n) {
        int i = 0,j  = n-1;

        while(i<j) {
            int mid = i+(j-i)/2;
            if(arr[mid] == k) {
                return mid;
            } if(arr[mid]<k) {
                i = i+1;
            } else {
                j = mid-1;
            }
        }
        return -1;
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
         int k = 4;
         int l = arr.length;        
        int ans = search(arr,k,l);
        System.out.println("Ouor element index present at index: "+ans);
        sc.close();

    }
}