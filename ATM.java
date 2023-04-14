import java.util.Scanner;

public class ATM {
    private static double balance = 100000; // Initial balance is set to 1000

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    balance += depositAmount;
                    System.out.println("Your new balance is " + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } 
                    else {
                        balance -= withdrawAmount;
                        System.out.println("Your new balance is " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice.");
            }
        } while (choice != 4);

        input.close();
    }
}
