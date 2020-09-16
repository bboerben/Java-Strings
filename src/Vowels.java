public class Vowels {
    public static void main(String[]args){
        String s = "apple pie is better than banana pie";
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
        System.out.println(count + " vowel(s)");
    }
}
