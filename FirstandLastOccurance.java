public class FirstandLastOccurance {
    public static int first = -1;
    public static int last = -1;
    public static void OccurancePrint(String str,int idx,char element) { 
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currCh = str.charAt(idx);
        if(currCh == element) {
            if(first == -1) {
                first = idx;
            } else{
                last = idx;
            }
        }
        OccurancePrint(str, idx+1, element);
    } 
    public static void main(String args[]) {
        String str = "abcaada";
        char element = 'a';
        OccurancePrint(str, 0, element);
    }
}