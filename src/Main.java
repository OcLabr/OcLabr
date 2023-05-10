import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(22);
        myList.add(22);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicate = new ArrayList<>();
        int count = 0;
        for (Integer integer : myList)
            if (!map.containsKey(integer)) {
                map.put(integer, integer);
            } else {
                count++;
                duplicate.add(integer);
                System.out.println(count);
                System.out.println(duplicate);
            }
    }
}