import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list2 = new ArrayList<>();

        for (Integer item : intList) {
            if (item > 0 && item % 2 == 0) {
                list2.add(item);
            }
        }
        Collections.sort(list2);
        for (Integer item : list2) {
            System.out.print(item + " ");
        }
    }
}