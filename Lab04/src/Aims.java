public class Aims {
    public static void main(String[] args) {

        //DVD1
        Order order1 = new Order();
        order1.setQtyOrdered(0);
        order1.createOrder("April 1st 1988");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirectory("Roger Allers");
        dvd1.setLength(87);
        order1.addDigitalVideoDisc(dvd1);
        order1.print();


        //DVD2
        Order order2 = new Order();
        order2.setQtyOrdered(0);
        order2.createOrder("April 20 1889");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirectory("George Lucas");
        dvd2.setLength(124);
        order2.addDigitalVideoDisc(dvd2);
        order2.print();


        //DVD3
        Order order3 = new Order();
        order3.setQtyOrdered(0);
        order3.createOrder("May 21 1889");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirectory("John Musker");
        dvd3.setLength(90);
        order3.addDigitalVideoDisc(dvd3);
        order3.print();
    }
}