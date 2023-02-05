package bank;

public class Main {
    
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("johnny");
        account1.deposit(100);
        account1.withdraw(50);
        System.out.printf("%s's account\nAccount number: %s\n>>Balance: $%.2f\n", account1.getName(),account1.getAccountNumber(),account1.getBalance());
        System.out.println(account1.getTransactions());

        FixedDepositAccount fd1 = new FixedDepositAccount("james", 100);
        fd1.deposit(10);
        fd1.withdraw(10);
        fd1.setBalance(500);
        System.out.printf("Current balance: $%.2f\n", fd1.getBalance());

    }
}
