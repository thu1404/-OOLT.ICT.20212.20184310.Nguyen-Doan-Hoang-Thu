package hust.soict.globalict.test.utils;

import java.text.ParseException;

import hust.soict.globalict.aims.utils.DateUtils;
import hust.soict.globalict.aims.utils.MyDate;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        MyDate date1 = new MyDate("April 21st 2001");
        MyDate date2 = new MyDate("April 20st 1889");
        MyDate date3 = new MyDate("August 31 2007");
        MyDate date4 = new MyDate("April 1st 1988");

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
