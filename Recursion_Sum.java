// import javax.lang.mo del.util.ElementScanner14;

public class Recursion_Sum {
    private static final int no = 0;

    static int printR(int no) {
        if(no!=0)
            return no+printR(no-1);
        else 
            return no;
    }

    public static void main(String [] args) {
        int n = 5;
        int ans = printR(n);
        System.out.println(ans);

    }
    
}
