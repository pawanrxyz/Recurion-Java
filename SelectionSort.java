public class SelectionSort { 
    public static void sort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int min_index = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

    }
    public static void main(String args[]) {
        int arr[] = {4,3,1,2,7,6};
        sort(arr);
        System.out.println("Sorting array ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    } 
    
}
