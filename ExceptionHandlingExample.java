import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Test 1: ArithmeticException
            int result = divideByZero();
            System.out.println("Result after dividing by zero: " + result);

            // Test 2: NullPointerException
            String nullString = null;
            printStringLength(nullString);

            // Test 3: ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
            accessArrayElement(array, 5);

            // Test 4: IOException
            readInput();
        } catch (ArithmeticException e) {
            handleException("ArithmeticException", e);
        } catch (NullPointerException e) {
            handleException("NullPointerException", e);
        } catch (ArrayIndexOutOfBoundsException e) {
            handleException("ArrayIndexOutOfBoundsException", e);
        } catch (IOException e) {
            handleException("IOException", e);
        } finally {
            System.out.println("Testing completed.");
        }
    }

    // Test method for ArithmeticException
    private static int divideByZero() {
        return 5 / 0;
    }

    // Test method for NullPointerException
    private static void printStringLength(String str) {
        System.out.println("Length of the string: " + str.length());
    }

    // Test method for ArrayIndexOutOfBoundsException
    private static void accessArrayElement(int[] array, int index) {
        System.out.println("Array element at index " + index + ": " + array[index]);
    }

    // Test method for IOException
    private static void readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter something: ");
        String input = reader.readLine();
        System.out.println("You entered: " + input);
    }

    // Method to handle and print exception details
    private static void handleException(String exceptionType, Exception e) {
        System.out.println("Exception caught: " + exceptionType);
        System.out.println("Exception details: " + e.getMessage());
        e.printStackTrace();
    }
}
