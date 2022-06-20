package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestDVDCompareTo {

    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(87, "abc", "The Lion King", "ABC", 13.6f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(97, "def", "Star War", "DEF", 26.6f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(120, "xyz", "Aladdin", "XYZ", 20.99f);

        Collection collection = new ArrayList();
        collection.add(dvd2);
        collection.add(dvd1);
        collection.add(dvd3);

        Iterator iterator = collection.iterator();
        System.out.println("=======================");
        System.out.println("THe DVDs currently in the order are: ");

        while (iterator.hasNext()) {
            DigitalVideoDisc temp = ((DigitalVideoDisc) iterator.next());
            System.out.print(temp.getTitle());
            System.out.println("--" + temp.getCost());
        }

        // sort 
        Collections.sort((List) collection);
        iterator = collection.iterator();

        System.out.println("=====================");
        System.out.println("THe DVDs in sorted order are: ");
        while (iterator.hasNext()) {
            DigitalVideoDisc temp = ((DigitalVideoDisc) iterator.next());
            System.out.print(temp.getTitle());
            System.out.println("--" + temp.getCost());
        }

        System.out.println("=====================");
    }
}
