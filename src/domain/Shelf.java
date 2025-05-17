package domain;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private final List<Stock> stocks;

    public Shelf(Stock stock) {
        stocks = new ArrayList<>();
        stocks.add(stock);
    }

    public void showStock() {
        for (Stock stock : stocks) {
            System.out.println("Categories: " + stock.getCategories() + "\nProducts: " + stock.getProducts());
        }
    }

    public void showCategories() {
        for (Stock stock : stocks) {
            System.out.println("Categories: " + stock.getCategories() + " ");
        }
    }

    public void showProducts() {
        for (Stock stock : stocks) {
            System.out.println("Products: " + stock.getProducts() + " ");
        }
    }

}
