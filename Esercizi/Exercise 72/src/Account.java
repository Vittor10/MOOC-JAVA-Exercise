import java.util.Scanner;

public class Account {
    String owner;
    double balance;


    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public static double deposit(double balance){
        double value;
        Scanner reader = new Scanner(System.in);
        System.out.println("how much do you want to deposit?: ");
        value = Double.parseDouble(reader.nextLine());
        balance = balance + value;
        return balance;
    }

    public static void outPut(String owner, double balance){
        System.out.println("Owner is: " + owner);
        System.out.println("Balance is: " + balance);
    }

}
