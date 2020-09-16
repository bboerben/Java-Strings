public class Consonants {
    public static void main(String[]args){
        String s = "apple";
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
        System.out.println(s.length() - count + " consonant(s)");
    }
}
