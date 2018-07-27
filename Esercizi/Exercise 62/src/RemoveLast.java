import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveLast {
    public static void main(String[] args) {
        List<String> brothers = new ArrayList<>();
        insert(brothers);
        int items = countItems(brothers);
        outPut(brothers);
        removeLast(brothers, items);
        outPut(brothers);
    }

    public static List<String> insert(List<String> brothers){
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");
        return brothers;
    }

    public static int countItems(List<String> brothers){
        int items;
        items = brothers.size() - 1;
        return items;
    }

    public static void removeLast(List<String> brothers, int items){
        brothers.remove(items);
    }

    public static void outPut(List<String> brothers){
        System.out.println(brothers);
    }
}
