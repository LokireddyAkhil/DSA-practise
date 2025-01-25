import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class AlphabetFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = scanner.nextLine();
        String filteredInput = input.toLowerCase().replaceAll("[^a-z]", "");

        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (char c : filteredInput.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Letter Frequency:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}