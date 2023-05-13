import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void verifyPalindromeString() {
        String expectedString = "abba";
        Assert.assertTrue(expectedString + " is Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifyNumericPalindromeString() {
        String expectedString = "12321";
        Assert.assertTrue(expectedString + " is Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifyNotPalindromeString() {
        String expectedString = "abab";
        Assert.assertFalse(expectedString + " is not Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifyNotNumericPalindromeString() {
        String expectedString = "123123";
        Assert.assertFalse(expectedString + " is not Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifyPalindromeNumber() {
        int expectedNumber = 123321;
        Assert.assertTrue(expectedNumber + " is Palindrome", Palindrome.isPalindrome(expectedNumber));
    }

    @Test
    public void verifyNotPalindromeNumber() {
        int expectedNumber = 123221;
        Assert.assertFalse(expectedNumber + " is not Palindrome", Palindrome.isPalindrome(expectedNumber));
    }

    @Test
    public void verifyEmptyString() {
        String expectedString = "";
        Assert.assertTrue("Empty String is Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifySingleString() {
        String expectedString = "a";
        Assert.assertTrue("Single String is Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifySinglePalindromeNumber() {
        int expectedNumber = 1;
        Assert.assertTrue(expectedNumber + " is Palindrome", Palindrome.isPalindrome(expectedNumber));
    }

    @Test
    public void verifySingleSpecialCharacterPalindromeString() {
        String expectedString = "!";
        Assert.assertTrue(expectedString + " is Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifySpecialCharactersPalindromeString() {
        String expectedString = "!@##@!";
        Assert.assertTrue(expectedString + " is Palindrome", Palindrome.isPalindrome(expectedString));
    }

    @Test
    public void verifySpecialCharactersNotPalindromeString() {
        String expectedString = "!@#$%^";
        Assert.assertFalse(expectedString + " is not Palindrome", Palindrome.isPalindrome(expectedString));
    }
}
