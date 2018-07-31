import java.util.Collections;
import java.util.Scanner;

public class Palindorme {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a text: ");
        String text = reader.nextLine();
        if(palindrome(text)){
            System.out.println("The text is a palindrome!");
        } else{
            System.out.println("The text is not a palindrome!");
        }


    }

    public static boolean palindrome(String text){
        boolean condition;
        String textRevers = "";
        /*for(int i = text.length() - 1; i >= 0; i--)
        {
            textRevers = textRevers + text.charAt(i);
        }*/
        StringBuilder stringBuilder = new StringBuilder(text);
        textRevers = stringBuilder.reverse().toString();
        System.out.println(textRevers);
        if(textRevers.equals(text)) {
            condition = true;
        }else{
            condition = false;
        }
        return condition;
    }

}
