package hust.soict.globalict.aims;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;

import java.util.Scanner;


public class Aims {

    public static void showMenu(Order order) {
        Scanner scanner = new Scanner(System.in);
        String spaceToContinue;
        String orderStatus;

        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("Order Status: ");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the itemslist of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number (0-1-2-3-4): ");
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                order = new Order();
                System.out.println("Order Created");
                spaceToContinue = scanner.nextLine();
                showMenu(order);
            }
            case 2: {
                System.out.println("Chose an item: ");
                System.out.println("1.Book");
                System.out.println("2.DVD");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Title: ");
                        String title = scanner.nextLine();
                        title = scanner.nextLine();
                        System.out.print("Category: ");
                        String category = scanner.nextLine();
                        Book book = new Book(title, category);
                        while (true) {
                            System.out.println("Enter Authors stop by enter (-): ");
                            String Author = scanner.nextLine();
                            if (Author.equals("-")) {
                                break;
                            }
                            book.addAuthor(Author);
                        }
                        System.out.print("Cost (Float): ");
                        float cost = scanner.nextFloat();
                        book.setCost(cost);

                        order.addMedia(book);
                        spaceToContinue = scanner.nextLine();
                        showMenu(order);

                    case 2:
                        System.out.print("Title: ");
                        String dvdtitle = scanner.nextLine();
                        dvdtitle = scanner.nextLine();
                        System.out.print("Category: ");
                        String dvdcategory = scanner.nextLine();
                        DigitalVideoDisc dvd = new DigitalVideoDisc(dvdtitle, dvdcategory);
                        System.out.print("Cost (Float): ");
                        float dvdcost = scanner.nextFloat();
                        dvd.setCost(dvdcost);
                        order.addMedia(dvd);
                        spaceToContinue = scanner.nextLine();
                        showMenu(order);
                }
            }
            case 3: {
                System.out.print("Deleted item ID: ");
                int aiDe = scanner.nextInt();
                order.removeMedia(aiDe);
                System.out.print("DELETED!!!!!");
                spaceToContinue = scanner.nextLine();
                showMenu(order);
            }
            case 4: {
                order.print();
                spaceToContinue = scanner.nextLine();
                showMenu(order);
            }
            case 0:
                break;
        }

    }

    public static void main(String[] args) {
        Order order = new Order();
        showMenu(order);
    }
}
