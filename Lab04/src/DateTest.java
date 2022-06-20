import java.text.ParseException;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        MyDate date1 = new MyDate("September 21st 2000");
        MyDate date2 = new MyDate("April 23rd 2011");
        MyDate date3 = new MyDate("August 15th 2020");
        MyDate date4 = new MyDate("Jun 2nd 2021");

        DateUtils dUtils = new DateUtils();
        dUtils.testCompare(date1, date2);

        MyDate[] dateArray = new MyDate[4];
        dateArray[0] = date1;
        dateArray[1] = date2;
        dateArray[2] = date3;
        dateArray[3] = date4;

        dUtils.testSortDate(dateArray);
    }
}
