package Databese;

import java.io.*;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class CSVSample  {
    public static void main (String[] args) throws CloneNotSupportedException {
        System.out.println(UserLoader.getUserHavingAgeGraterThan(10));

        List<User> result = UserLoader.getUsersWhere((User u) -> {
            return u.getAge() > 10;
        };
        }
        Set<User> db = new HashSet<>();

        /*MySQLAccess mySQLAccess = new MySQLAccess();

        BufferedReader reader = Files.newBufferedReader(new File("db.config").toPath()); //buffered serve per non leggere tutto il file insieme
        List<User> utenti = new ArrayList<>();
        try {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String array[ ] = line.split(",");
                int id = Integer.parseInt(array[0]);
                String name = array[1];
                int age = Integer.parseInt(array[2]);
                String email = array [3];
                utenti.add(new User(id,  age, name, email));
            }
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }*/


    }
}
