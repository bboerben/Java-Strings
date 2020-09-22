import java.util.StringTokenizer;
import java.util.ArrayList;

public class LastLetterCount {
    public static void main(String[] args) {
        String s = "He's crazy";

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
        System.out.println(ans);
    }

}
