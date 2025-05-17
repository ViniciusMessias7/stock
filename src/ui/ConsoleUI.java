package ui;

import domain.Shelf;
import domain.Stock;

import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Stock stock = new Stock();
        Shelf stockShelf = new Shelf(stock);

        char commands;

        stock.addCategories("Food");
        stock.addCategories("Tool");
        stock.addProducts("Apple");
        stock.addProducts("Axe");

        System.out.println("Available commands:");
        System.out.println("  S           Show products and categories.");
        System.out.println("  C           Show all categories");
        System.out.println("  P           Show all products");
        System.out.println("  F           Exit program");
        System.out.print("Command: ");
        commands = userInput.nextLine().toUpperCase().charAt(0);

        switch (commands) {
            case 'S':
                stockShelf.showStock();
                break;
            case 'C':
                stockShelf.showCategories();
                break;
            case 'P':
                stockShelf.showProducts();
            case 'F':
                break;
            default:
                System.out.println("Invalid command!");
        }

    }
}
