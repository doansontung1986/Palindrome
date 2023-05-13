import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PalindromeRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PalindromeTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Are all test cases passed? " + result.wasSuccessful());
    }
}
