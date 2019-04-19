public class Main {

    public static void main(String[] args) {

        BankAccountFacade bankFacade = new BankAccountFacade(123456789, 1234);

        bankFacade.withdrawCash(900.00);
        bankFacade.withdrawCash(200.00);
        bankFacade.depositCash(500.00);
    }
}
