import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        insert(words);
        outPut();


    }

    public static ArrayList<String> insert(ArrayList<String> words){
        Scanner reader = new Scanner(System.in);
        boolean condition = true;
        while (condition){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if(words.contains(word))
                condition = false;
            words.add(word);
        }
        return (ArrayList<String>) words;
    }

    public static void outPut(){
        System.out.println("You gave the word celery twice");
    }

}


