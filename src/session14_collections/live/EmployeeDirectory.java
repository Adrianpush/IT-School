package session14_collections.live;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDirectory {

    public static void main(String[] args) {
        Map<String, String> employeeMap1 = new HashMap<>();
        employeeMap1.put("E100", "Alice");
        employeeMap1.put("E101", "John");
        employeeMap1.put("E102", "Andrew");

        Map<String, String> employeeMap2 = new HashMap<>();
        employeeMap2.put("E102", "Andrew");
        employeeMap2.put("E103", "Joe");

        displayEmployeeInfo(getCommonEntries(employeeMap1, employeeMap2));
    }

    private static void displayEmployeeInfo(Map<String, String> map) {
        for (Map.Entry<String, String> employee : map.entrySet()) {
            System.out.println("Employee with id " + employee.getKey() +
                    " is " + employee.getValue() + ".");
        }
    }

    private static Map<String, String> getCommonEntries(Map<String, String> first, Map<String, String> second) {
        Map<String, String> commonEntries = new HashMap<>();
        for (String key : first.keySet()) {
            if (second.containsKey(key) && second.get(key).equals(first.get(key))) {
                commonEntries.put(key, first.get(key));
            }
        }
        return commonEntries;
    }
}
