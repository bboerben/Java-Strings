public class Palindrome {
    public static void main(String[] args) {
        String p = "abcczba";

        String q = "";
        for(int i = p.length() - 1; i >= 0; i--)
            q += p.charAt(i);
        System.out.println(p.compareTo(q) ==  0? "Yes, it is" : "No, it isn't");
    }
}
