package Databese;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class UserLoader {
    private static final List<User> db = new ArrayList<>();
    static {
        db.add(new User(1, 20, "em1@email.it", "Vittorio"));
        db.add(new User(2, 30, "em2@email.it", "Antonio"));
        db.add(new User(3, 19, "em3@email.it", "Francesco"));
        db.add(new User(4, 20, "em4@email.it", "Vincenzo"));
        db.add(new User(5, 78, "em5@email.it", "Giuseppe"));
        db.add(new User(6, 45, "em6@email.it", "Aldo   "));
        db.add(new User(7, 54, "em7@email.it", "Francesca"));
        db.add(new User(8, 54, "em7@email.it", "Maria"));
        db.add(new User(9, 81, "em7@email.it", "Roberta"));
    }

    public static List<User> getUsers(){
        List<User> cloneDB = new ArrayList<>(db.size());

        Iterator<User> iter = db.iterator();
        while(iter.hasNext()){
            User u = iter.next();

            cloneDB.add(u.clone());
        }
        return cloneDB;

    }

    public static List<String> getEmails(){
        List<String> onlyMails = new ArrayList<>(db.size());
        for (User u : db)
            onlyMails.add(u.getEmail());

        return onlyMails;
    }

    public static List<User> getUserswhitAgeAndNameLessThan(int maxAge, String maxDec){
        List<User> result = new ArrayList<>();
        for(User u : db)
            if(u.getAge() < maxAge && u.getName().compareTo(maxDec) < 0)
                result.add(u.clone());
        return result;
    }

    public static User getUserHavingId(int id){
        System.out.println("Start searching for a user having id equals to" + id);
        User result = null;

        for (User u : db){
            if (u.getId() == id)
                System.out.println("User founded and it's" + u.toString());
                result = u.clone();
                break;
        }

        if(result == null) System.out.println("No user founded having id");

        return result;
    }

    private static List<User> compareAll(Filter filter){
        System.out.println("Received the filter" + );
        List<User> result = new ArrayList<>();

        for(User u : db) {
            System.out.println("Ready to test the element");
            if (filter.test(u))
                System.out.println("Filter, test true return true. Added the ele into the result list");
            result.add(u);
        }
        return result;
    }

    interface Filter {
        boolean test(User u);
    }

    static  class FilterCheckAge implements Filter{
        int max;
        FilterCheckAge(int max) {
            this.max = max;
        }

        @Override
        public boolean test (User u){
            return u.getAge() < max;
        }
    }
    public static  List<User> getUserHavingAgeGraterThan(int age) throws  CloneNotSupportedException{
        return  compareAll(new Filter()){
            @Override
            public boolean test(User u){
                System.out.println("filter test is invoked");
                return u.getAge();
            }
        }
    }

    public getUserWhere(Filter filter){


    }
}



