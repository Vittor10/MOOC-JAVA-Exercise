import java.io.Reader;
import java.util.Scanner;

public class Bigger {
    public static void main(String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        System.out.print("Insert second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        int max = Math.max(numberOne, numberTwo);
        System.out.print("The  bigger number of the two number gives is: " + max);

    }
}
