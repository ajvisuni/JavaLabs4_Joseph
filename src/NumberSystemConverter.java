import java.util.Scanner;

public class NumberSystemConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nChoose what operation you want to perform:");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("W. Exit the program");
            System.out.print("Your choice: ");

            choice = scanner.nextLine().trim().toUpperCase();

            try {
                switch (choice) {
                    case "A":
                        int decimalResult = getNumberAsDecimal(scanner, "Enter the number to convert:");
                        System.out.println("Result in Decimal (base 10): " + decimalResult);
                        break;
                    case "B":
                        System.out.print("Enter decimal number: ");
                        int decNum = Integer.parseInt(scanner.nextLine());
                        printResultInTargetSystem(decNum, scanner);
                        break;
                    case "C":
                        System.out.println("--- First Number ---");
                        int sum1 = getNumberAsDecimal(scanner, "Enter first number:");
                        System.out.println("--- Second Number ---");
                        int sum2 = getNumberAsDecimal(scanner, "Enter second number:");
                        printResultInTargetSystem(sum1 + sum2, scanner);
                        break;
                    case "D":
                        System.out.println("--- First Number ---");
                        int sub1 = getNumberAsDecimal(scanner, "Enter first number:");
                        System.out.println("--- Second Number ---");
                        int sub2 = getNumberAsDecimal(scanner, "Enter second number:");
                        printResultInTargetSystem(sub1 - sub2, scanner);
                        break;
                    case "E":
                        System.out.println("--- First Number ---");
                        int mul1 = getNumberAsDecimal(scanner, "Enter first number:");
                        System.out.println("--- Second Number ---");
                        int mul2 = getNumberAsDecimal(scanner, "Enter second number:");
                        printResultInTargetSystem(mul1 * mul2, scanner);
                        break;
                    case "F":
                        System.out.println("--- First Number ---");
                        int div1 = getNumberAsDecimal(scanner, "Enter first number:");
                        System.out.println("--- Second Number ---");
                        int div2 = getNumberAsDecimal(scanner, "Enter second number:");
                        if (div2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                        } else {
                            printResultInTargetSystem(div1 / div2, scanner);
                        }
                        break;
                    case "W":
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid letter.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format. Please try again.");
            }

        } while (!choice.equals("W"));

        scanner.close();
    }

    private static int getNumberAsDecimal(Scanner scanner, String prompt) {
        System.out.print("Enter the base of the system (e.g., 2 for binary, 16 for hex, 10 for decimal): ");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.print(prompt + " ");
        String numStr = scanner.nextLine();
        return Integer.parseInt(numStr, base);
    }

    private static void printResultInTargetSystem(int decimalValue, Scanner scanner) {
        System.out.print("Enter the target system base for the result (e.g., 2, 8, 16): ");
        int targetBase = Integer.parseInt(scanner.nextLine());
        String result = Integer.toString(decimalValue, targetBase).toUpperCase();
        System.out.println("Result in base " + targetBase + ": " + result);
    }
}