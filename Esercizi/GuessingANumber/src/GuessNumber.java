import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        int numGen;
        int num;
        numGen = generateNumber();
        num = insert();
        guessNum(num, numGen);

    }


public static int insert(){
    Scanner reader = new Scanner(System.in);
    System.out.println("Guess a number: ");
    int n = Integer.parseInt(reader.nextLine());
    return n;
}

public static int generateNumber(){
    Random random = new Random();
     int numGen = random.nextInt(100);
    return numGen;
}

public static int guessNum(int n, int nGen){
    boolean condition = true;
    int count = 1;
        while (condition){
        if(n == nGen){
            System.out.println("Congratulations, your guess is correct!");
            condition = false;
        }else if(n > nGen){
            System.out.println("The number is lesser, Guesses made: " + count);
            count ++;
            n =insert();
        }else if (n < nGen){
            System.out.println("The number is greater, Guesses made: " + count);
            count ++;
            n = insert();
        }

    }
    return n;
}
}
