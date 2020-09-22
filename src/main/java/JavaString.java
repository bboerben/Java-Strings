import java.util.ArrayList;
import java.util.StringTokenizer;

public class JavaString {
    public static int consonats(String s) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean isVowel = false;
            for(char c : vowels) {
                if (c == s.charAt(i)) {
                    isVowel = true;
                    count++;
                    break;
                }
            }
            if (!isVowel) s = s.substring(0, i) + '*' + s.substring(i + 1, s.length());
        }
        return s.length() - count;
    }

    public static String lastLetterCount(String s) {
        // Remove all the comma and period.
        s = s.replaceAll(",|\\.", "").toLowerCase();
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<String> tokens = new ArrayList<>();

        int hasS = -1, hasY = -1;
        int i = 0;
        while(st.hasMoreTokens()){
            String word = st.nextToken();

            // Assign the index of first word with 's' and 'y' to hasS and hasY
            if (word.charAt(word.length() - 1) == 's' && hasS == -1) hasS = i;
            if (word.charAt(word.length() - 1) == 'y' && hasY == -1) hasY = i;
            tokens.add(word);
            i++;
        }

        // if the sentence contains both words end with s and y
        if(hasS != -1 && hasY != -1){
            String tmp = tokens.get(hasS);
            tokens.set(hasS, tokens.get(hasY));
            tokens.set(hasY, tmp);
        }

        String ans = "";
        boolean firstWord = true;
        for(String word : tokens) {
            if (firstWord) {
                ans += word.substring(0, 1).toUpperCase() + word.substring(1);
                firstWord = false;
            } else {
                ans += word;
            }
            ans += " ";
        }
        ans = ans.substring(0, ans.length() - 1) + ".";
        return ans;
    }

    public static boolean palindrome(String p) {
        String q = "";
        for(int i = p.length() - 1; i >= 0; i--)
            q += p.charAt(i);
        return p.compareTo(q) == 0;
    }

    public static int vowels(String s){
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for(char c : vowels) {
                if (c == s.charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int words(String s){
        StringTokenizer st = new StringTokenizer(s);
        int i = st.countTokens();
        return i;
    }
}
