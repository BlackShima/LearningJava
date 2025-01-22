package OOP.Lab6.Account;

public class TestAccount {
    public static void main(String[] args) {

        Account account = new Account(1122, 20000);

        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Account Id: " + account.getId());
        System.out.println("Balance: " + account.getBalance() + " THB");
        System.out.println("Monthly Interest: " + account.getMonthlyInterest() + " THB");
        System.out.println("Date Created: " + account.getDateCreated());
    }
}

