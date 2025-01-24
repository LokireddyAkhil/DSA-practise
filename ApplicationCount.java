import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ApplicationCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> managerAppCount = new HashMap<>();
        System.out.println("Enter application-manager pairs (format: Application-Manager). Type 'done' to stop:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            String[] parts = input.split("-");
            if (parts.length != 2) {
                System.out.println("Invalid format. Please use 'Application-Manager'.");
                continue;
            }
            String manager = parts[1].trim();
            managerAppCount.put(manager, managerAppCount.getOrDefault(manager, 0) + 1);
        }
        System.out.println("Service Manager Report:");
        for (Map.Entry<String, Integer> entry : managerAppCount.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        scanner.close();
    }
}