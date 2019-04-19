public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    private void increaseCashInAccount(double cashDeposited){
        cashInAccount += cashDeposited;
    }

    private void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal){
        if (cashToWithdrawal > getCashInAccount()){
            System.out.println("Error: Not enough balance");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Complete");
            System.out.println("Current Balance: " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete");
        System.out.println("Current Balance: " + getCashInAccount());
    }
}
