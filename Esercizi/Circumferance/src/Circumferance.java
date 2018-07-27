import java.util.Scanner;

public class Circumferance{
public static void main (String[]args){
        System.out.println("*****Calculating circumference*****");
        System.out.print("Insert radius: ");
        Scanner reader=new Scanner(System.in);
        double radius = Integer.parseInt(reader.nextLine());
        double circumference = 2 * Math.PI *radius;
        System.out.println("The result is: " + circumference);
        }
        }
