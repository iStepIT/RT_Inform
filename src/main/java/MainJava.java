import java.util.HashMap;
import java.util.Map;

public class MainJava {
    public static void main(String[] args) {

        int[] list = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> countMap = countElements(list);
        System.out.println(countMap);
    }

    public static Map<Integer, Integer> countElements(int[] list) throws IllegalArgumentException {

        if (list.length == 0) {
            throw new IllegalArgumentException("List is null");
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }
}
