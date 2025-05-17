package domain;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final List<String> categories;
    private final List<String> products;

    public Stock() {
        categories = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addCategories(String category) {
        categories.add(category);
    }

    public void addProducts(String product) {
        products.add(product);
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getProducts() {
        return products;
    }
}
