import java.util.StringTokenizer;

public class Words {
    public static void main(String[] args) {
        String s = "Hello, World";
        StringTokenizer st = new StringTokenizer(s);
        int i = st.countTokens();
        System.out.println(i);
    }
}
