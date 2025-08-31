import java.util.Scanner;

public class casdt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Available currencies
        String[] currencies = {"USD", "EUR", "INR", "GBP", "JPY"};

        // Hardcoded exchange rates (relative to 1 USD)
        double USD_TO_EUR = 0.92;
        double USD_TO_INR = 83.10;
        double USD_TO_GBP = 0.78;
        double USD_TO_JPY = 145.50;

        System.out.println("Available currencies: USD, EUR, INR, GBP, JPY");

        // Input base currency
        System.out.print("Enter base currency: ");
        String base = scanner.next().toUpperCase();

        // Input target currency
        System.out.print("Enter target currency: ");
        String target = scanner.next().toUpperCase();

        // Input amount
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        // Convert base to USD first
        double amountInUSD = 0;
        switch (base) {
            case "USD": amountInUSD = amount; break;
            case "EUR": amountInUSD = amount / USD_TO_EUR; break;
            case "INR": amountInUSD = amount / USD_TO_INR; break;
            case "GBP": amountInUSD = amount / USD_TO_GBP; break;
            case "JPY": amountInUSD = amount / USD_TO_JPY; break;
            default:
                System.out.println("Invalid base currency!");
                return;
        }

        // Convert USD to target
        double converted = 0;
        switch (target) {
            case "USD": converted = amountInUSD; break;
            case "EUR": converted = amountInUSD * USD_TO_EUR; break;
            case "INR": converted = amountInUSD * USD_TO_INR; break;
            case "GBP": converted = amountInUSD * USD_TO_GBP; break;
            case "JPY": converted = amountInUSD * USD_TO_JPY; break;
            default:
                System.out.println("Invalid target currency!");
                return;
        }

        System.out.printf("%.2f %s = %.2f %s\n", amount, base, converted, target);
        scanner.close();
    }
}
