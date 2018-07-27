import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        insert(words);
        outPut(words);


    }

    public static ArrayList<String> insert(ArrayList<String> words){
        Scanner reader = new Scanner(System.in);
        boolean condition = true;
        while (condition){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            words.add(word);
            if(word.isEmpty())
                condition = false;
        }
        return (ArrayList<String>) words;
    }

    public static void outPut(ArrayList<String> words){
        System.out.println("You type the following word: ");
        for(String word : words){
            System.out.println(word);
        }
    }

}
