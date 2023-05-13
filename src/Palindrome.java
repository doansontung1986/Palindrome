public class Palindrome {

    public static boolean isPalindrome(String str) {
        int length = str.length();
        int i = 0;
        int j = length - 1;

        if (length <= 1) {
            return true;
        }

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome(int number) {
        int i, sum = 0;
        int originalNumber;

        originalNumber = number;
        while (number > 0) {
            i = number % 10;
            sum = (sum * 10) + i;
            number /= 10;
        }

        if (originalNumber == sum) {
            return true;
        } else {
            return false;
        }
    }
}
