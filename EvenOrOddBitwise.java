public class EvenOrOddBitwise {
    
    public static void main (String args[]) {
        int n = 12;

        if( (n & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
            
        }
    }
    
}
