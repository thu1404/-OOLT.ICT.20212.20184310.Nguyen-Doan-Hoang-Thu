package hust.soict.globalict.aims;

import hust.soict.globalict.aims.order.Order;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
	
	static ArrayList<DigitalVideoDisc> dvdList = new ArrayList<DigitalVideoDisc>();
    static ArrayList<Book> bookList = new ArrayList<Book>();
    static ArrayList<CompactDisc> cdList = new ArrayList<CompactDisc>();
    static Scanner scanner = new Scanner(System.in);
	static ArrayList<Order> anOrder = new ArrayList<Order>();
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void showMenuItem() {
        System.out.println(" ---------- MENU ITEM ----------");
        System.out.println("1. Digital Video Disc");
        System.out.println("2. Book");
        System.out.println("3. CD");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 1-2-3");
    }
	
	public static void showOrderList(ArrayList<Order> orders) {
        for (int i = 0; i < orders.size(); i++) {
            System.out.print((i + 1) + ".");
            orders.get(i).showOrder();
        }
    }
	
	public static void showDVD(ArrayList<DigitalVideoDisc> dvdList) {
        System.out.println("The number of dvds : " + dvdList.size());
        System.out.println("No-Type-ID-Title-Length-Director-Cost-Category");
        for (int i = 0; i < dvdList.size(); i++) {
            System.out.print((i + 1) + ".");
            dvdList.get(i).showDVD();
        }
        System.out.println("*****************************");

    }

    public static void showBook(ArrayList<Book> bookList) {
        System.out.println("The number of books : " +bookList.size());
        System.out.println("No-Type-ID-Title-Cost-Category-Authors");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print((i + 1) + ".");
            bookList.get(i).showBook();
        }
        System.out.println("*****************************");
    }
	
    public static void showCD(ArrayList<CompactDisc> cdList) {
        System.out.println("The number of CDs : " +cdList.size());
        System.out.println("No--ID-------Title---Cost----Tracks");
        for (int i = 0; i < cdList.size(); i++) {
            System.out.print((i + 1) + "."+cdList.get(i).getIdMedia()+"-");
            cdList.get(i).showAllTrack();
        }
        System.out.println("*****************************");
    }
    
    public static void removeMedia() {
        int select;
        do {
            showMenuItem();
            System.out.println("Enter item to add");
            select = scanner.nextInt();
            if (select > 4 || select < 1) {
                System.out.println("Enter selection item again");
            }

        } while (select > 4 || select < 1);
        scanner.nextLine();
        switch (select) {
            case 1:
                showDVD(dvdList);
                System.out.println("Input id to remove");
                int rm = scanner.nextInt();
                scanner.nextLine();
                dvdList.remove(rm - 1);
                break;
            case 2:
                showBook(bookList);
                System.out.println("Input id to remove");
                rm = scanner.nextInt();
                scanner.nextLine();
                bookList.remove(rm - 1);
                break;
            case 3:
                showCD(cdList);
                System.out.println("Input id to remove");
                rm = scanner.nextInt();
                scanner.nextLine();
                cdList.remove(rm - 1);
                break;
            default:
                break;
        }
    }
    
	public static void main(String[] args) {
		int choice;
		int count = -1;
		MemoryDaemon md = new MemoryDaemon();
        Thread thread = new Thread(md);
        thread.setDaemon(true);
        thread.start();
        
		do{
			showMenu();
			choice = scanner.nextInt();
			if (choice > 4 || choice < 0) {
                System.out.println("Enter selection again");
            }
			switch (choice) {
	        case 1: {
                System.out.println("~~~~ Order is created ~~~~");
                count++;
                break;
	        }
	        case 2: {
	            System.out.println("Chose an item: ");
	            System.out.println("1.DVD");
	            System.out.println("2.Book");
	            System.out.println("3.CDs");
	            System.out.println("Please choose a number: 1-2-3");
	            choice = scanner.nextInt();
	            switch (choice) {
	            case 1: //------ DVD --------
	                System.out.println("Input title of digital video disc:");
	                String titleDVD = scanner.nextLine();
                    titleDVD = scanner.nextLine();
	                System.out.println("Input category of digital video disc:");
	                String categoryDVD = scanner.nextLine();
	                System.out.println("Input cost of digital video disc:");
	                float costDVD = scanner.nextFloat();
	                scanner.nextLine();
	                System.out.println("Input length of digital video disc:");
	                int lengthDVD = scanner.nextInt();
	                scanner.nextLine();
	                System.out.println("Input director of digital video disc:");
	                String directorDVD = scanner.nextLine();
	                String idDVD ;
	                if(dvdList.size()<10){
	                    idDVD="DVD0"+(dvdList.size()+1);
	                }
	                else{
	                    idDVD = "DVD"+(dvdList.size()+1);
	                }
	                DigitalVideoDisc disc = new DigitalVideoDisc(lengthDVD, directorDVD, titleDVD, categoryDVD, costDVD,idDVD);
	                dvdList.add(disc);
	                break;
	            case 2: // ----- book -------
	                System.out.println("Input title of book:");
	                String titleBook = scanner.nextLine();
	                titleBook = scanner.nextLine();
	                System.out.println("Input category of book:");
	                String categoryBook = scanner.nextLine();
	                System.out.println("Input cost of book:");
	                float costBook = scanner.nextFloat();
	                scanner.nextLine();
	                String idBook ;
	                if(bookList.size()<10){
	                    idBook="B0"+(bookList.size()+1);
	                }
	                else{
	                    idBook = "B"+(bookList.size()+1);
	                }
	                Book book = new Book(titleBook, categoryBook, costBook,idBook);
	                System.out.println("Input author of book: ");
	                String exit;
	                do {
	                    // scanner.nextLine();
	                    String tempAuthor;
	                    System.out.println("Author: ");
	                    tempAuthor = scanner.nextLine();
	                    book.addAuthor(tempAuthor);
	                    System.out.println("Add another author?? (Y/N)");
	                    exit = scanner.next().toLowerCase();

	                } while (exit.equals("y"));
	                bookList.add(book);
	                break;
	            case 3: // ----- CDs ------
	                System.out.println("Input name of artist:");
	                String artist = scanner.nextLine();
	                artist = scanner.nextLine();
	                System.out.println("Input cost of CDs:");
	                float costCD = scanner.nextFloat();
	                scanner.nextLine();
	                System.out.println("Input title of CD:");
	                String tilteCD = scanner.nextLine();
	                String idCD ;
	                if(cdList.size()<10){
	                    idCD="CD0"+(cdList.size()+1);
	                }
	                else{
	                    idCD = "CD"+(cdList.size()+1);
	                }
	                CompactDisc compact = new CompactDisc(artist, tilteCD, costCD,idCD);
	                System.out.println("Input the track of the compact disc: ");
	                String text;
	                do {
	                    System.out.println("Input title track:");
	                    String titleTrack = scanner.nextLine();	                  
	                    System.out.println("Input length of track:");
	                    int lengthTrack = scanner.nextInt();
	                    scanner.nextLine();
	                    Track track = new Track(lengthTrack, titleTrack);
	                    compact.addTrack(track);
	                    System.out.println("Do you want to add other track? (Y/N)");
	                    text = scanner.nextLine().toLowerCase();
	                } while (text.equals("y"));

	                cdList.add(compact);
	                break;
	            }
	            break;
	        }
	        case 3: {
	        	removeMedia();
                break;
	        }
	        case 4: {
	        	System.out.println("***********************Order***********************");
                showDVD(dvdList);
                showBook(bookList);
                showCD(cdList);
	            break;
	        }
	        case 0:
	            break;
			}
		}while(choice!=0);
	}
		
}
