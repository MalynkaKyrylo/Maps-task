package app.task3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = getInitContactData();
        getOutput("Initial contacts:", contacts);
        editContactData(contacts);
        getOutput("Updated contacts:", contacts);
    }

    private static Map<String, String> getInitContactData() {
        return new LinkedHashMap<>(Map.of("Tom", "tom@mail.com", "Lisa", "lisa@mail.com", "Alice", "alisa@mail.com", "Denis", "den@mail.com"));
    }

    private static void editContactData(Map<String, String> contacts) {
        contacts.replace("Tom", "tomasdev@glob.net");
    }

    private static void getOutput(String title, Map<String, String> contacts) {
        Set<Map.Entry<String, String>> entries = contacts.entrySet();
        System.out.println(title);
        int counter = 1;
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(counter + ") " +entry.getKey() + " - " + entry.getValue());
            counter++;
        }
        System.out.println();
    }

}
