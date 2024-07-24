import java.util.Scanner;

public class Bank {
    /*
    Task1
   Create a Bank class and declare an instance variable named amount of type double.
   Create parameterized constructor to initialize variable “amount” with value 10000.
   Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
   Calculate withdrawal based on some condition (using ternary operator) like
   If amount is sufficient then “withdraw successful” message will be printed on the console
   and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.
   At the end display total balance on the console.
    */
    // initialize global amount variable here
    private static double amount;

    // initialize default constructor
    public Bank() {
    }

    // initialize secondary constructor
    public Bank(double amount) {
        Bank.amount = amount;
    }

    // main method start
    public static void main(String[] args) {
        // create bank object using default constructor
        Bank a = new Bank();
        // call bankService method which perform all operation of withdrawal and deposit under this service
        a.bankService();

    }

    /* this method take user input 1 or 2 if he enters 1 then this method call deposit method,
    if he enters 2 then this method call withdraw method or if he enters wrong value,
    then this method recall this method to select correct no.
    */
    private void bankService() {

        Bank bank = new Bank(10000);
        System.out.print("""
                Hello Guest User
                Select any no 1/2 :
                Deposit: 1
                Withdraw: 2
                Enter no here:""");

        Scanner sc = new Scanner(System.in);
        int selectedNo = sc.nextInt();
        if (selectedNo == 1) {
            System.out.print("Selected no: " + selectedNo + "\nEnter deposit amount:");


            bank.deposit(sc.nextInt());

        } else if (selectedNo == 2) {
            System.out.print("Selected no: " + selectedNo + "\nEnter withdrawal amount:");

            bank.withdraw(sc.nextInt());
        } else {
            System.out.println("\nSelect valid no " + selectedNo);
            bankService();
        }
    }

    // This method perform withdrawal process first take withdrawal amount then show total amount

    private void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= amount) {
            double currentBalance = amount - withdrawalAmount;
            System.out.print("Withdraw successful of " + withdrawalAmount + "\nTotal amount left: " + currentBalance + "\n");
            amount = currentBalance;
            System.out.println("Thank you for using our service...");


        } else {
            System.out.println("You don't sufficient balance for withdrawal.");

        }

    }

    // This method perform deposit process first take deposited amount then show total amount
    private void deposit(double depositAmount) {
        amount = amount + depositAmount;
        System.out.println("Deposit " + depositAmount + " in the account balance.");
        System.out.println("Total balance : " + amount);
        System.out.println("Thank you for using our service...");

    }
}
