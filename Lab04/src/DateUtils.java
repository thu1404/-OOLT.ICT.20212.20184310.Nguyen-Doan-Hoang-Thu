import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public final class DateUtils {
    public static void compareDate(MyDate date1, MyDate date2) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");

        Date d1 = sdformat.parse(date1.getDate());
        Date d2 = sdformat.parse(date2.getDate());
        System.out.println("The date 1 is: " + sdformat.format(d1));
        System.out.println("The date 2 is: " + sdformat.format(d2));
        if (d1.compareTo(d2) > 0) {
            System.out.println("Date 1 occurs after Date 2");
        } else if (d1.compareTo(d2) < 0) {
            System.out.println("Date 1 occurs before Date 2");
        } else if (d1.compareTo(d2) == 0) {
            System.out.println("Both dates are equal");
        }
    }

    public static void sortDate(MyDate[] dateArray) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");

        Date[] date = new Date[dateArray.length];

        for (int i = 0; i < dateArray.length; i++) {
            date[i] = sdformat.parse(dateArray[i].getDate());
        }
        Arrays.sort(date);

        for (Date date1 : date) {
            System.out.println(sdformat.format(date1));
        }
    }

    public void testCompare(MyDate date1, MyDate date2) throws ParseException {
        compareDate(date1, date2);
    }

    public void testSortDate(MyDate[] dateArray) throws ParseException {
        sortDate(dateArray);
    }

}
