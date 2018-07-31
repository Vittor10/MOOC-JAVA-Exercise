public class Main {
    public static void main(String[] args) {
        double pay;
        Account mattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("Vittorio", 0.00);
        mattsAccount.outPut(mattsAccount.owner, mattsAccount.balance);
        myAccount.outPut(myAccount.owner, myAccount.balance);
        pay = Account.amountPayment();
        mattsAccount.balance = mattsAccount.payment(mattsAccount.balance, pay);
        myAccount.balance = myAccount.credit(myAccount.balance, pay);
        mattsAccount.outPut(mattsAccount.owner, mattsAccount.balance);
        myAccount.outPut(myAccount.owner, myAccount.balance);




    }
}
