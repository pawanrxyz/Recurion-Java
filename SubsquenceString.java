public class SubsquenceString {
    public static void subSquenece(String str,int idx,String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSquenece(str, idx+1, newString+currChar);
        subSquenece(str, idx+1, newString);
    }
    public static void main(String args[]) {
        String str = "abc";
        subSquenece(str, 0, "");
        
    }
}