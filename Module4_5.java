import java.util.Scanner;

class Account{
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 1000.0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance should be greater than 1000.0");
        }
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void exit() {
        System.out.println("Exiting from the individual transaction");
    }

}
public class Module4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String branchName, accountNumber;
        boolean exitApplication = false;

        while (!exitApplication) {
            System.out.print("Enter branch name: ");
            branchName = scanner.next();

            System.out.print("Enter account number: ");
            accountNumber = scanner.next();

            Account account = new Account(1500);

           
         System.out.println("Enter amount to be credited:");
         double amount=scanner.nextDouble();
         account.credit(amount);
         System.out.println("Enter amount to be depited:");
         double dep=scanner.nextDouble();
         account.debit(dep);
         System.out.println("Balance:"+account.getBalance());
          System.out.println("Exit application? (Yes/No): ");
            String exitChoice = scanner.next();

            if (exitChoice.equalsIgnoreCase("Yes")) {
                exitApplication = true;
 account.exit();
            }
        }
       

        scanner.close();
    }
}

