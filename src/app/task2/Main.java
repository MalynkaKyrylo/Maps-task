package app.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        findProduct(getProductName());
    }

    private static String getProductName() {
        System.out.println("Enter the name of the product you want to find: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    private static void findProduct(String product) {
        Map<String, Integer> products = getInitData();
        if (products.containsKey(product)) {
            System.out.println("Product name: " + product + "\nQuantity: " + products.get(product));
        } else {
            System.out.println("No such product in database :(");
        }
    }

    private static Map<String, Integer> getInitData() {
        return new HashMap<>(Map.of("tomato", 20, "cucumber", 15, "potato", 50, "carrot", 30, "onion", 10, "cabbage", 10));
    }

}
