package a;

public class DateTest {
	public static void main(String[] args) {
        MyDate date = new MyDate();
        date.accept();
        date.print();
        date.setDay(14);
        date.setMonth(3);
        date.setYear(2021);
        date.print();
    }
}
