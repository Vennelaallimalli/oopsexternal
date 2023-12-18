import java.util.Scanner;

public class ECommerceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter product details
        System.out.println("Enter product name:");
        String productName = scanner.nextLine();

        System.out.println("Enter company name:");
        String company = scanner.nextLine();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        // Determine the cost-effective option
        String recommendedPlatform = getRecommendedPlatform(productName, quantity);

        // Display the recommendation
        System.out.println("Recommendation: Buy '" + productName + "' from " + recommendedPlatform);

        // Close the scanner
        scanner.close();
    }

    private static String getRecommendedPlatform(String productName, int quantity) {
        // Constants
        final int AMAZON_DISCOUNT_THRESHOLD = 50000;
        final int FLIPKART_DISCOUNT_THRESHOLD = 30000;

        // Discounts
        final double AMAZON_HDFC_DISCOUNT = 0.10;
        final double AMAZON_HIGH_PURCHASE_DISCOUNT = 0.15;
        final double FLIPKART_RGUKT_STUDENT_DISCOUNT = 0.30;
        final double FLIPKART_HIGH_PURCHASE_DISCOUNT = 0.05;

        // Calculate costs
        double amazonCost = calculateAmazonCost(productName, quantity);
        double flipkartCost = calculateFlipkartCost(productName, quantity);

        // Determine the cost-effective option
        if (amazonCost < flipkartCost) {
            return "Amazon";
        } else {
            return "Flipkart";
        }
    }

    private static double calculateAmazonCost(String productName, int quantity) {
        // Dummy implementation, you can replace this with actual logic
        double basePrice = 100; // Replace with the actual base price of the product on Amazon
        double totalCost = basePrice * quantity;

        // Apply discounts
        if (totalCost > 50000) {
            totalCost *= (1 - 0.15); // 15% discount for purchases above 50,000
        } else {
            totalCost *= (1 - 0.10); // 10% discount for HDFC credit card holders
        }

        return totalCost;
    }

    private static double calculateFlipkartCost(String productName, int quantity) {
        // Dummy implementation, you can replace this with actual logic
        double basePrice = 120; // Replace with the actual base price of the product on Flipkart
        double totalCost = basePrice * quantity;

        // Apply discounts
        if (quantity > 30000) {
            totalCost *= (1 - 0.05); // 5% discount for purchases above 30,000
        } else {
            totalCost *= (1 - 0.30); // 30% discount for RGUKT students
        }

        return totalCost;
    }
}
