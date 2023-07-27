package app.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> products = getInitData();
        getOutput("Initial data:", products);
        updateData(products);
        getOutput("Updated data:", products);
    }

    private static Map<String, Integer> getInitData() {
        return new HashMap<>(Map.of("orange", 12, "banana", 25, "lemon", 8, "pineapple", 13, "grape", 9));
    }

    private static void updateData(Map<String, Integer> products) {
        products.replace("banana", 14);
        products.put("plum", 15);
    }

    private static void getOutput(String title, Map<String, Integer> products) {
        Set<Map.Entry<String, Integer>> entries = products.entrySet();
        System.out.println(title);
        int counter = 1;
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(counter + ") " +entry.getKey() + ", " + entry.getValue());
            counter++;
        }
        System.out.println();
    }





}
