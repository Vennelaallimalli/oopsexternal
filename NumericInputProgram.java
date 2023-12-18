import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a numeric value: ");
            int numericInput = scanner.nextInt();
            System.out.println("You entered: " + numericInput);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        } finally {
            scanner.close();
        }
    }

}
