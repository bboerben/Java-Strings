import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStringTest {

    @Test
    public void consonats() {
        String s = "apple";
        int res = JavaString.consonats(s);
        assertTrue(res == 3);
    }

    @Test
    public void lastLetterCount() {
        String s = "He's crazy";
        String res = JavaString.lastLetterCount(s);
        assertEquals(res.compareTo("Crazy he's."), 0);
    }

    @Test
    public void testNonPalindrome() {
        String s = "abcda";
        assertFalse(JavaString.palindrome(s));
    }

    @Test
    public void testPalindrome() {
        String s = "abcba";
        assertTrue(JavaString.palindrome(s));
    }

    @Test
    public void vowels() {
        String s = "apple pie is better than banana pie";
        int res = JavaString.vowels(s);
        assertEquals(res, 13);
    }

    @Test
    public void words() {
        String s = "Hello, World";
        int res = JavaString.words(s);
        assertEquals(res, 2);
    }
}