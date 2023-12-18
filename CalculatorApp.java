mkdir calculator
//

package calculator;

public interface CalculatorOperations {
    double add(double num1, double num2);
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
    double squareRoot(double num);
}
// File: calculator/BasicCalculator.java
package calculator;

import static java.lang.Math.sqrt;

public class BasicCalculator implements CalculatorOperations {

    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    @Override
    public double squareRoot(double num) {
        if (num < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }
        return sqrt(num);
    }
}
// File: CalculatorApp.java
import calculator.BasicCalculator;
import calculator.CalculatorOperations;

public class CalculatorApp {
    public static void main(String[] args) {
        // Create an instance of the BasicCalculator
        CalculatorOperations calculator = new BasicCalculator();

        // Perform some calculations
        double resultAdd = calculator.add(10, 5);
        double resultSubtract = calculator.subtract(10, 5);
        double resultMultiply = calculator.multiply(10, 5);
        double resultDivide = calculator.divide(10, 5);
        double resultSquareRoot = calculator.squareRoot(25);

        // Display results
        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
        System.out.println("Square Root: " + resultSquareRoot);
    }
}
