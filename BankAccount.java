public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public static int getTotalAccounts(){
        return accounts;
    }
        public static double getTotalMoney(){
        return totalMoney;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositInCheckingAccount(double depositAmount){
        checkingBalance+= depositAmount;
        totalMoney+= depositAmount;
    }
    public void depositInSavingsAccount(double depositAmount){
        savingsBalance+= depositAmount;
        totalMoney+= depositAmount;
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawFromCheckingAccount(double withdrawalAmount){
        if ((checkingBalance - withdrawalAmount) >=0){
            checkingBalance-= withdrawalAmount;
            totalMoney-= withdrawalAmount;
        }else {System.out.println("You don't have enough money in your checking account to make this withdrawal");}
    }
    public void withdrawFromSavingsAccount(double withdrawalAmount){
        if ((savingsBalance - withdrawalAmount) >=0){
            savingsBalance-= withdrawalAmount;
            totalMoney-= withdrawalAmount;
        }else {System.out.println("You don't have enough money in your savings account to make this withdrawal");}
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getTotalBalance(){
        return checkingBalance + savingsBalance;
    }
}
