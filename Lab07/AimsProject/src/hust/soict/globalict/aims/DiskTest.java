//package hust.soict.globalict.aims;
//
//import hust.soict.globalict.aims.disc.DigitalVideoDisc;
//import hust.soict.globalict.aims.order.Order;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class DiskTest {
//
//    public static void main(String[] args) {
//    	Order anOrder = new Order();
//    	anOrder.createOrder("April 1st 2020");
//    	//DVD1
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
//        dvd1.setCategory("Animation");
//        dvd1.setCost(19.95f);
//        dvd1.setDirector("Roger Allers");
//        dvd1.setLength(87);
//
//        //DVD2
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
//        dvd2.setCategory("Science Fiction");
//        dvd2.setCost(24.95f);
//        dvd2.setDirector("George Lucas");
//        dvd2.setLength(124);
//        
//        //DVD3
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
//        dvd3.setCategory("Animation");
//        dvd3.setCost(18.99f);
//        dvd3.setDirector("John Musker");
//        dvd3.setLength(90);
//        
//        anOrder.addDigitalVideoDisc(dvd1,dvd2);
//        anOrder.addDigitalVideoDisc(dvd3);
//        
//        //Search
//        String title2;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter title to search:");
//        title2 = in.nextLine();
//        if(dvd1.search(title2) || dvd2.search(title2) || dvd3.search(title2)) {
//        	System.out.println("There are at least 1 disc have title " + title2);
//        }else {
//        	System.out.println("Don't have " + title2 + " in any title disc");
//        }
//        
//        //luckyItem
//        DigitalVideoDisc dvdLucky = anOrder.getALuckyItem();
//        System.out.println("\nFree DVD-" + dvdLucky.getTitle() + "-"
//                + dvdLucky.getCategory() + "-"
//                + dvdLucky.getDirector() + "-"
//                + dvdLucky.getLength() + ": "
//                + dvdLucky.getCost() + "$");
//
//    }
//}