package ui;

import domain.Stock;

import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Stock stock = new Stock();
        char commands;

        System.out.println("Available commands:");
        System.out.println("  P           Add product");
        System.out.println("  S           Show stock");
        System.out.println("  F           Exit program");
        System.out.print("Command: ");
        commands = userInput.nextLine().toUpperCase().charAt(0);
        
        switch (commands) {
            case 'P':
                System.out.println("Add product to stock: ");
                stock.addProducts(userInput.nextLine());
                break;
            case 'S':
                stock.showStock();
                break;
            case 'F':
                System.out.print("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid command!");
        }

    }
}
