public class Fact1 {
    public static int printFact(int n) {
        if(n==0 || n == 1) {
            return 1;
        }            // int fact = n-1; 
                    // int ans = n*fact;
            int fact = printFact(n-1);
            int Fact_n = n*fact;
            return Fact_n;
    }
    public static void main(String[] args) {
        int ans = printFact(5);
        System.out.println(ans);        
    }    
}
