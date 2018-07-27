import java.util.Scanner;

public class TheLengthOfName {
    public static void main(String[] args) {
        String name;
        int lenght;
        int ln;
        name = insert();
        lenght = lengthOfName(name);
        ln = lenght;
        firstCharacter(name);
        lastCaracter(name, lenght);
        trheeCharacters(name, lenght);
        separate(name, lenght);
        reversing(name, ln);
    }

    public static String insert(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        return name;
    }

    public static int lengthOfName(String name){
        int lenght;
        lenght = name.length();
        System.out.println("Numbers of Characters: " + lenght);
        return lenght;
    }

    public static void firstCharacter(String name){
        char first;
        first = name.charAt(0);
        System.out.println("First character: " + first);
    }

    public static void lastCaracter(String name, int lenght){
        char last;
        lenght--;
        last = name.charAt(lenght);
        System.out.println("Last character: " + last);
    }

    public static void trheeCharacters(String name, int lenght){
        int n = 1;
        if(lenght > 2) {
            for (int i = 0; i < 3; i++) {
                name.charAt(i);
                System.out.println("Character " + n + ": " + name.charAt(i));
                n++;
            }
        }else
            System.out.println(" ");
    }

    public static void separate(String name, int lenght){
        int ln = 0;
        int n = 1;
        System.out.println("\n");
        while(ln != lenght){
            System.out.println("Character " + n + ": " + name.charAt(ln));
            ln++;
            n++;
        }
    }

    public static void reversing(String name, int lenght){
        System.out.println("\n");
        System.out.print("In revers order: ");
        for(int i = lenght - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}

