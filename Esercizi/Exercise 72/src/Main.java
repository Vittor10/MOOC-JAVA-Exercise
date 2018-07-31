import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double newBalance;
        Scanner reader = new Scanner(System.in);
        Account account = new Account("Vittorio", 100.00);
        System.out.println("The owner is: " + account.owner + "\n" + "The balance is: " + account.balance);
        System.out.println("Do you want to deposit?: ");
        String risp = reader.nextLine();
        if(risp.equals("si")){
            newBalance = Account.deposit(account.balance);
            Account.outPut(account.owner, newBalance);
        }else
            System.out.println("See you later");
    }


}
