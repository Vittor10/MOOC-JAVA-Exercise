import java.util.Scanner;

public class Numberisevenorodd {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String v = "no";
        while(v.equals("no")){
            System.out.print(" Type number: ");
            int x = Integer.parseInt(reader.nextLine());
            int result = x % 2;
            if (result == 0)
                System.out.println("Number " + x + " is even");
            else System.out.println("Number " + x + " is odd");

            System.out.print("Would you terminate the program: ");
            v = reader.nextLine();
        }
    }
}

