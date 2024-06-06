package pritjava;
import java.util.*;

public class practicle_13_bank_account {

    float deposit(float balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Deposit Amount: ");
        float d = sc.nextFloat();
        return balance + d;
    }

    float withdraw(float balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Withdraw Amount: ");
        float w = sc.nextFloat();
        if (w > balance) {
            System.out.println("Insufficient funds. Withdrawal not possible.");
            return balance;
        }
        return balance - w;
    }

    void display(String name, int accNo, float balance) {
        System.out.println("Name of Account holder: " + name);
        System.out.println("Account number: " + accNo);
        System.out.println("Balance of Account: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practicle_13_bank_account account = new practicle_13_bank_account();

        System.out.print("Enter the Name of account holder: ");
        String nameOfAccountHolder = sc.nextLine();

        System.out.print("Enter the account number: ");
        int accountNo = sc.nextInt();

        System.out.print("Enter the Balance of Account: ");
        float balance = sc.nextFloat();
        sc.nextLine(); // Consume newline character

        while (true) {
            System.out.print("Perform task (true/false): ");
            String taskInput = sc.nextLine();
            if (!Boolean.parseBoolean(taskInput)) {
                break;
            }

            System.out.print("Choose any operation (1)Deposit/(2)Withdraw/(3)Display: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    balance = account.deposit(balance);
                    System.out.println("Updated balance after deposit: " + balance);
                    break;
                case 2:
                    balance = account.withdraw(balance);
                    System.out.println("Updated balance after withdrawal: " + balance);
                    break;
                case 3:
                    account.display(nameOfAccountHolder, accountNo, balance);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
