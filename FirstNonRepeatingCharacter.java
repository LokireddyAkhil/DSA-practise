import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Example list
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('d');
        list.add('b');
        list.add('e');

        // Find the first non-repeating character
        Character nonRepeatingChar = null;

        for (int i = 0; i < list.size(); i++) {
            char current = list.get(i);
            boolean isRepeating = false;

            // Check if the character repeats in the list
            for (int j = 0; j < list.size(); j++) {
                if (i != j && current == list.get(j)) {
                    isRepeating = true;
                    break;
                }
            }

            // If it doesn't repeat, it's the first non-repeating character
            if (!isRepeating) {
                nonRepeatingChar = current;
                break;
            }
        }

        // Print the result
        if (nonRepeatingChar != null) {
            System.out.println("First non-repeating character: " + nonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}