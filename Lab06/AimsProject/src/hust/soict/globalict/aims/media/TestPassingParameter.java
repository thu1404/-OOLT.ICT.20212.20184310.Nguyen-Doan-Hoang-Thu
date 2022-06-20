package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cindderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd tilte: " + cinderellaDVD.getTitle());

        changeTile(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        String tmp = dvd1.getTitle();
//        dvd1.setTitle(dvd2.getTitle());
//        dvd2.setTitle(tmp);
    	DigitalVideoDisc tmpDvd;
    	tmpDvd = dvd1;
    	dvd1 = dvd2;
    	dvd2=tmpDvd;
    	
    }

    public static void changeTile(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
    }
}
