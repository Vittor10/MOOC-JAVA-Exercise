import java.util.Scanner;

public class Divider {
    public static void main (String[] args)
    {
        double x;
        double y;
        double quotient;
        Scanner reader= new Scanner(System.in);
        System.out.print("Sent a first number: ");
        x = Integer.parseInt(reader.nextLine());
        System.out.print("Sent a second number: ");
        y = Integer.parseInt(reader.nextLine());
        quotient = x / y;
        System.out.print("The result is: " + quotient);

    }
}