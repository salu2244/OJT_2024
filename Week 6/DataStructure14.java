import java.util.HashMap;

public class DataStructure14 {

    private HashMap<Integer, Integer> elements = new HashMap<>();

    public void add(int number) {
        if (elements.containsKey(number)) {
            elements.put(number, elements.get(number) + 1);
        } else {
            elements.put(number, 1);
        }
    }

    public boolean find(int value) {
        for (Integer i : elements.keySet()) {
            int target = value - i;
            if (elements.containsKey(target)) {
                if (i == target && elements.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DataStructure14 ds = new DataStructure14();
        ds.add(1);
        ds.add(3);
        ds.add(5);

        System.out.println("Find 4: " + ds.find(4)); // Should print true
        System.out.println("Find 7: " + ds.find(7)); // Should print false
    }
}
