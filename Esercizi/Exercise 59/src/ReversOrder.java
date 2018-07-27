import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversOrder {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        insert(words);
        outPutReverse(words);


    }

    public static ArrayList<String> insert(ArrayList<String> words){
        Scanner reader = new Scanner(System.in);
        boolean condition = true;
        while (condition){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if(word.isEmpty())
                condition = false;
            words.add(word);
        }
        return (ArrayList<String>) words;
    }

    public static void outPutReverse(ArrayList<String> words){
        Collections.reverse(words);
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
