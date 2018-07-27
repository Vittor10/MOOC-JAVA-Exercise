import java.io.Reader;
import java.util.Scanner;


public class Checkingpassword {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String pwd = "pass";

        while(true){
            System.out.print("Type a password: ");
            String pwdInsert = reader.nextLine();
            if (pwd.equals(pwdInsert)){
                System.out.println("The secret is: uau");
                    break;
            }else
                System.out.println("WRONG!!");
        }
    }
}
