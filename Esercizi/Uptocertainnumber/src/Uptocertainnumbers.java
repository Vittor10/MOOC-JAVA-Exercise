import java.util.Scanner;

public class Uptocertainnumbers {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int num = 1;
        int nuser;
        System.out.print("Type number: ");
        nuser = Integer.parseInt(reader.nextLine());
        while (num <= nuser){
            System.out.println(num);
            num= num + 1;

        }
    }
}
