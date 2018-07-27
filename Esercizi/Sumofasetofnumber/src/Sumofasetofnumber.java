import java.util.Scanner;

public class Sumofasetofnumber {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String risp = "no";
        while (risp.equals("no")) {
            int num, i;
            System.out.print("Type number: ");
            num = Integer.parseInt(reader.nextLine());
            i = num;
            while (i > 1) {
                i--;
                num = num * i;

            }
            System.out.println("The sum is: " + num);
            System.out.print("Would you terminate the program: ");
            risp = reader.nextLine();
        }
        System.out.println("TERMINATE");
        }
}
