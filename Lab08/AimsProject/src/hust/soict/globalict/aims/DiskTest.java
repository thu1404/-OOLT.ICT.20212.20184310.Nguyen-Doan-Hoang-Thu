//package hust.soict.globalict.aims;
//
//import hust.soict.globalict.aims.media.DigitalVideoDisc;
//import hust.soict.globalict.aims.order.Order;
//
//public class DiskTest {
//    public static void main(String[] args) {
//        DigitalVideoDisc dvd = new DigitalVideoDisc("Hitler did nothing wrong");
//        System.out.println(dvd.search("Hitler wrong"));
//
//        //DVD1
//        Order order1 = new Order();
//        order1.createOrder("April 1st 1988");
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
//        dvd1.setCategory("Animation");
//        dvd1.setCost(19.95f);
//        dvd1.setDirector("Roger Allers");
//        dvd1.setLength(87);
//       order1.addDigitalVideoDisc(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Mein Kampf");
//        dvd2.setCategory("Family Friendly");
//        dvd2.setCost(16.9f);
//        dvd2.setDirector("Not Hitler");
//        dvd2.setLength(87);
//     order1.addDigitalVideoDisc(dvd2);
//       order1.getALuckyItem();
//        order1.print();
//
//
//    }
//
//}