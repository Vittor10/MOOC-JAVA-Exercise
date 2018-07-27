import java.util.Scanner;

public class Sumaskuser {
    public static void main (String[] args)
    {
        int x;
        int y;
        int sum;
        Scanner reader = new Scanner(System.in);
        System.out.print("Sent the first number: ");
        x = Integer.parseInt(reader.nextLine());
        System.out.print("Sent the second number: ");
        y = Integer.parseInt(reader.nextLine());
        sum = x + y;
        System.out.println("The result is:" + sum);

    }

}
