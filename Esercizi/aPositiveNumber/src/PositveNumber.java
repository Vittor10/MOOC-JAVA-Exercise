import java.util.Scanner;

public class PositveNumber {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        int v = 1;
        while (v == 1){
            System.out.print("Type a number: ");
            int number = Integer.parseInt(reader.nextLine());
            if (number > 0) {
                System.out.println("Number " + number + " is positive");
            }
            if (number == 0) {
                System.out.println("Number " + number + " is neutral");
            }
            if (number < 0) {
                System.out.println("Number " + number + " is negative");
            }

            System.out.println("would you terminate the program?");
            v = Integer.parseInt(reader.nextLine());
        }
    }
}
