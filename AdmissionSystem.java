mkdir admission
// File: admission/EligibilityCheck.java
package admission;

public interface EligibilityCheck {
    boolean checkEligibility(int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks);
}
// File: admission/EngineeringAdmission.java
package admission;

public class EngineeringAdmission implements EligibilityCheck {
    private static final int MIN_MATHS_MARKS = 90;
    private static final int MIN_PHYSICS_MARKS = 95;
    private static final int MIN_CHEMISTRY_MARKS = 70;
    private static final int MIN_ENGLISH_MARKS = 80;
    private static final double MIN_TOTAL_PERCENTAGE = 80.0;

    @Override
    public boolean checkEligibility(int mathsMarks, int physicsMarks, int chemistryMarks, int englishMarks) {
        double totalPercentage = (mathsMarks + physicsMarks + chemistryMarks + englishMarks) / 4.0;

        return mathsMarks >= MIN_MATHS_MARKS &&
               physicsMarks >= MIN_PHYSICS_MARKS &&
               chemistryMarks >= MIN_CHEMISTRY_MARKS &&
               englishMarks >= MIN_ENGLISH_MARKS &&
               totalPercentage >= MIN_TOTAL_PERCENTAGE;
    }
}
// File: AdmissionSystem.java
import admission.EligibilityCheck;
import admission.EngineeringAdmission;

import java.util.Scanner;

public class AdmissionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EligibilityCheck eligibilityCheck = new EngineeringAdmission();

        System.out.println("Enter marks for the following subjects:");
        System.out.print("Maths: ");
        int mathsMarks = scanner.nextInt();

        System.out.print("Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Chemistry: ");
        int chemistryMarks = scanner.nextInt();

        System.out.print("English: ");
        int englishMarks = scanner.nextInt();

        // Check eligibility
        if (eligibilityCheck.checkEligibility(mathsMarks, physicsMarks, chemistryMarks, englishMarks)) {
            System.out.println("Congratulations! You are eligible for engineering admission.");
        } else {
            System.out.println("Sorry, you are not eligible for engineering admission.");
        }

        // Close the scanner
        scanner.close();
    }
}

