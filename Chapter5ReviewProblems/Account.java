public class Account{
    private double balance;
    private String name;
    private long acctNum;

    private static int numDeposits;
    private static int numWithdrawals;
    private static int amtDeposits;
    private static int amtWithdrawals;

    public Account(double initBal, String owner, long number){
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            numWithdrawals++;
            amtWithdrawals += amount;
        }else
            System.out.println("Insufficent funds");
    }

    public void deposit(double amount){
        balnce += amount;
        numDeposits++;
        amtDeposits += amount;
    }

    public void transfer(Account acct, double amount){
        acct.deposit(amount);
        this.withdraw(amount);
    }

    public double getBalance(){
        return balance;
    }

    public double getAcctNumber(){
        return acctNum;
    }

    public static int getNumDeposits(){
        return numDeposits;
    }

    public static int getNumWithdrawals(){
        return numWithdrawals;
    }

    public static int getAmtDeposit(){
        return amtDeposits;
    }

    public static int getAmtWithdrawals(){
        return amtWithdrawals;
    }

    public static void resetStaticVars(){
        numDeposits = 0;
        numWithdrawals = 0;
        amtDeposits = 0;
        amtWithdrawals = 0;
    }

    public void printSummary(){
        System.out.println("Account number: " + acctNum);
        System.out.println("Account owner: " + name);
        System.out.println("Account balance: " + balance);
    }
}