package OOP;

import java.util.Scanner;

public class PersonalBankATM {

    // menu constants (avoid magic numbers)
    private static final int FUND_TRANSFER = 1;
    private static final int CASH_WITHDRAW = 2;
    private static final int CASH_DEPOSIT = 3;
    private static final int CHANGE_PIN = 4;
    private static final int CHANGE_MOBILE = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continueOperation = true;

        while (continueOperation) {

            showMenu();

            System.out.print("Enter your choice [1 to 5]: ");
            int choice = sc.nextInt();

            switch (choice) {
                case FUND_TRANSFER:
                    System.out.println("Fund transferred successfully");
                    break;
                case CASH_WITHDRAW:
                    System.out.println("Cash withdrawn successfully");
                    break;
                case CASH_DEPOSIT:
                    System.out.println("Cash deposited successfully");
                    break;
                case CHANGE_PIN:
                    System.out.println("ATM PIN changed successfully");
                    break;
                case CHANGE_MOBILE:
                    System.out.println("Mobile number updated successfully");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }

            System.out.print("Do you want to continue (yes/no): ");
            String response = sc.next();

            continueOperation = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using Personal ATM");
        sc.close();
    }

    // method to display menu
    private static void showMenu() {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Fund Transfer");
        System.out.println("2. Cash Withdraw");
        System.out.println("3. Cash Deposit");
        System.out.println("4. Change ATM PIN");
        System.out.println("5. Change Mobile Number");
    }
}
