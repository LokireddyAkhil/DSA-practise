import java.util.*;

public class IncidentImpact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of incidents:");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> incidents = new ArrayList<>();

        System.out.println("Enter the incidents in the format INCx-y (e.g., INC1-2):");
        for (int i = 0; i < n; i++) {
            String incident = scanner.nextLine();
            incidents.add(incident);
        }
        Map<String, Integer> incidentMap = new HashMap<>();
        for (String incident : incidents) {
            String[] parts = incident.split("-");
            String incidentNumber = parts[0];
            int caseCount = Integer.parseInt(parts[1]);
            incidentMap.put(incidentNumber, caseCount);
        }
        List<Map.Entry<String, Integer>> sortedIncidents = new ArrayList<>(incidentMap.entrySet());
        sortedIncidents.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nSorted Incidents by Impact:");
        for (Map.Entry<String, Integer> entry : sortedIncidents) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        Map.Entry<String, Integer> mostImpactIncident = sortedIncidents.get(0);
        System.out.println("\nIncident with Most Impact: " + mostImpactIncident.getKey());

        scanner.close();
    }
}