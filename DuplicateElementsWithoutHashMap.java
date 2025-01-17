import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsWithoutHashMap {
    public static void main(String[] args) {
        // Example list with duplicate elements
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");
        list.add("grape");
        list.add("banana");

        // List to track elements we already processed
        List<String> processed = new ArrayList<>();

        System.out.println("Duplicate elements with their repetition count:");

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            if (!processed.contains(element)) { // Process each element only once
                int count = 0;

                // Count occurrences of the element
                for (int j = 0; j < list.size(); j++) {
                    if (element.equals(list.get(j))) {
                        count++;
                    }
                }

                // If count > 1, it's a duplicate
                if (count > 1) {
                    System.out.println(element + " -> " + count);
                }

                // Mark element as processed
                processed.add(element);
            }
        }
    }
}