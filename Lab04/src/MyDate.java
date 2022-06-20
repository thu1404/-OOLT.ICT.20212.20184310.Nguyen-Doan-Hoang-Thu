import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private String strDay;
    private String strMonth;
    private String strYear;
    private String date;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public MyDate() {
        this.day = Calendar.getInstance().get(Calendar.YEAR);
        this.month = Calendar.getInstance().get(Calendar.MONTH);
        this.year = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(String date) {
        Month month = new Month();
        String[] arrOfDate = date.split(" ", 3);

        String strMonth = arrOfDate[0];
        String strDay = arrOfDate[1].replaceAll("th", "")
                .replaceAll("st", "")
                .replaceAll("rd", "")
                .replaceAll("nd", "");
        String strYear = arrOfDate[2];
        month.monthToInt(strMonth, 0);

        this.day = Integer.parseInt(strDay);
        this.month = month.getiMonth();
        this.year = Integer.parseInt(strYear);
    }

    public MyDate(String day, String month, String year) {
        this.strDay = day;
        this.strMonth = month;
        this.strYear = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }
    
    public String getDate() {
        return day + "/" + month + "/" + year;
    }

    public void accept() {
        Month month = new Month();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter in the format (ex: February 18th 2019):");
        date = in.nextLine();

        String[] arrOfDate = date.split(" ", 3);

        String strMonth = arrOfDate[0];
        String strDay ;
        
        strDay = arrOfDate[1].replace("th", "");
        String strYear = arrOfDate[2];
        month.monthToInt(strMonth, 0);

        this.day = Integer.parseInt(strDay);
        this.month = month.getiMonth();
        this.year = Integer.parseInt(strYear);

    }

    public void printIntDate() {
        System.out.println("Date: " + this.day + '/' + this.month + '/' + this.year);
    }

    public void print() {
        Month monthConv = new Month();

        String strDay = monthConv.getDayOfMonthSuffix(this.day);
        String strMonth = monthConv.getMonthForInt(this.month);

        System.out.println("Date: " + strMonth + " " + strDay + " " + this.year);

    }
}

