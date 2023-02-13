public class String_Rev {
    public static void printRev(String str, int idx) {
        if(idx==0) {
            System.out.print(str.charAt(idx) );
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }
    public static void main(String[] args) {
        String str = "pawan";
        System.out.print(str);
        System.out.println();
        printRev(str, str.length()-1);
    }
    
}
