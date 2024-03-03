public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount bankAccount1 = new BankAccount(100, 100);
        BankAccount bankAccount2 = new BankAccount(500, 500);
        BankAccount bankAccount3 = new BankAccount(1000, 1000);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        bankAccount1.depositInCheckingAccount(50);
        bankAccount1.depositInSavingsAccount(50);
        System.out.println(bankAccount1.getCheckingBalance());
        System.out.println(bankAccount1.getSavingsBalance());

        bankAccount2.depositInCheckingAccount(100);
        bankAccount2.depositInSavingsAccount(100);
        System.out.println(bankAccount2.getCheckingBalance());
        System.out.println(bankAccount2.getSavingsBalance());

        bankAccount3.depositInCheckingAccount(500);
        bankAccount3.depositInSavingsAccount(500);
        System.out.println(bankAccount3.getCheckingBalance());
        System.out.println(bankAccount3.getSavingsBalance());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        bankAccount1.withdrawFromCheckingAccount(25);
        bankAccount1.withdrawFromSavingsAccount(25);
        System.out.println(bankAccount1.getCheckingBalance());
        System.out.println(bankAccount1.getSavingsBalance());

        bankAccount2.withdrawFromCheckingAccount(50);
        bankAccount2.withdrawFromSavingsAccount(50);
        System.out.println(bankAccount2.getCheckingBalance());
        System.out.println(bankAccount2.getSavingsBalance());

        bankAccount3.withdrawFromCheckingAccount(100);
        bankAccount3.withdrawFromSavingsAccount(100);
        System.out.println(bankAccount3.getCheckingBalance());
        System.out.println(bankAccount3.getSavingsBalance());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getTotalAccounts());
        System.out.println(bankAccount1.getTotalBalance());
        System.out.println(BankAccount.getTotalMoney());
        System.out.println(bankAccount1.getCheckingBalance());
        System.out.println(bankAccount1.getSavingsBalance());
    }
}

