//package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit fruit = null;

        while (true) {
            System.out.println("\nFruit Basket Menu:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 1:
                    System.out.print("Enter Mango Name: ");
                    String mn = sc.nextLine();
                    System.out.print("Enter Color: ");
                    String mc = sc.nextLine();
                    System.out.print("Enter Weight: ");
                    double mw = sc.nextDouble();
                    fruit = new Mango(mn, mc, mw);
                    break;

                case 2:
                    System.out.print("Enter Orange Name: ");
                    String on = sc.nextLine();
                    System.out.print("Enter Color: ");
                    String oc = sc.nextLine();
                    System.out.print("Enter Weight: ");
                    double ow = sc.nextDouble();
                    fruit = new Orange(on, oc, ow);
                    break;

                case 3:
                    System.out.print("Enter Apple Name: ");
                    String an = sc.nextLine();
                    System.out.print("Enter Color: ");
                    String ac = sc.nextLine();
                    System.out.print("Enter Weight: ");
                    double aw = sc.nextDouble();
                    fruit = new Apple(an, ac, aw);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            // Print fruit details
            System.out.println("Fruit Added!");
            System.out.println(fruit.toString());
            System.out.println("Taste: " + fruit.taste());
        }
    }
}
