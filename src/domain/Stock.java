package domain;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final List<String> products;

    public Stock() {
        products = new ArrayList<>();
    }

    public void showStock() {
        if (products.isEmpty()) {
            System.out.print("The stock is empty! Use 'P' to add a product or 'F' to exit.\n");
            return;
        }

        System.out.print("Products: ");
        for (String product : products) {
            System.out.print(product + " ");
        }
    }

    public void addProducts(String product) {
        products.add(product);
    }

}
