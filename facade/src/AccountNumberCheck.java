public class AccountNumberCheck {

    private int accountNumber = 123456789;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int accountNumber){
        return accountNumber == getAccountNumber();
    }
}
