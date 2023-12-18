mkdir complex
// File: complex/Arith.java
package complex;

import java.util.Scanner;

public class Arith {
    private int rp;
    private int ip;

    // Default constructor
    public Arith() {
        this.rp = 0;
        this.ip = 0;
    }

    // Parameterized constructor
    public Arith(int rp, int ip) {
        this.rp = rp;
        this.ip = ip;
    }

    // Getter for real part
    public int getRp() {
        return rp;
    }

    // Getter for imaginary part
    public int getIp() {
        return ip;
    }

    // Setter for real part
    public void setRp(int rp) {
        this.rp = rp;
    }

    // Setter for imaginary part
    public void setIp(int ip) {
        this.ip = ip;
    }

    // Method to display complex number
    public void display() {
        System.out.println(rp + "+" + ip + "i");
    }
}
// File: ComplexCalculator.java
import complex.Arith;

public class ComplexCalculator {

    // Method to add two complex numbers
    public static Arith add(Arith a1, Arith a2) {
        int rpSum = a1.getRp() + a2.getRp();
        int ipSum = a1.getIp() + a2.getIp();
        return new Arith(rpSum, ipSum);
    }

    // Method to subtract two complex numbers
    public static Arith sub(Arith a1, Arith a2) {
        int rpDiff = a1.getRp() - a2.getRp();
        int ipDiff = a1.getIp() - a2.getIp();
        return new Arith(rpDiff, ipDiff);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter real part and imaginary part of 1st complex no:");
        int rp1 = scanner.nextInt();
        int ip1 = scanner.nextInt();
        Arith a1 = new Arith(rp1, ip1);

        // Input for the second complex number
        System.out.println("Enter real part and imaginary part of 2nd complex no:");
        int rp2 = scanner.nextInt();
        int ip2 = scanner.nextInt();
        Arith a2 = new Arith(rp2, ip2);

        // Displaying the input complex numbers
        System.out.println("a1=" + a1.display());
        System.out.println("a2=" + a2.display());

        // Performing addition and subtraction
        Arith sum = add(a1, a2);
        Arith diff = sub(a1, a2);

        // Displaying the results
        System.out.println("Added value: " + sum.display());
        System.out.println("Subtracted value: " + diff.display());

        // Close the scanner
        scanner.close();
    }
}
