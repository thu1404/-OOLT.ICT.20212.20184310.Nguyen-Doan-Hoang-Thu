//package hust.soict.globalict.test;
//
//import hust.soict.globalict.aims.media.DigitalVideoDisc;
//
//public class TestPassingParameter {
//    public static void main(String[] args) {
//        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
//        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
//
//        swap(jungleDVD, cinderellaDVD);
//        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
//        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
//
//        changeTile(jungleDVD, cinderellaDVD.getTitle());
//        System.out.println("jungle dvd title " + jungleDVD.getTitle());
//    }
//
//    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        String tmp = dvd1.getTitle();
//        dvd1.setTitle(dvd2.getTitle());
//        dvd2.setTitle(tmp);
//    }
//
//    public static void changeTile(DigitalVideoDisc dvd, String title) {
//        dvd.setTitle(title);
//    }
//}
