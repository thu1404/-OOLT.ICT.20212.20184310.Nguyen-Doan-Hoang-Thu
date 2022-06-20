package hust.soict.globalict.aims.utils;
import java.text.DateFormatSymbols;

public class Month {
    int iMonth;
    int iDays;

    public boolean monthToInt(String strMonth, int iYear) {
        boolean isMonthValid = true;
        switch (strMonth) {
            case "January", "Jan.", "Jan", "1":
                iDays = 31;
                iMonth = 1;
                break;
            case "February", "Feb.", "Feb", "2":
                if (iYear % 4 != 0 || ((iYear % 100 == 0) && (iYear % 400 != 0))) {
                    iDays = 28;
                } else iDays = 29;
                iMonth = 2;
                break;
            case "March", "Mar.", "Mar", "3":
                iDays = 31;
                iMonth = 3;
                break;
            case "April", "Apr.", "Apr", "4":
                iDays = 30;
                iMonth = 4;
                break;
            case "May", "5":
                iDays = 31;
                iMonth = 5;
                break;
            case "June", "Jun", "6":
                iDays = 30;
                iMonth = 6;
                break;
            case "July", "Jul", "7":
                iDays = 31;
                iMonth = 7;
                break;
            case "August", "Aug.", "Aug", "8":
                iDays = 31;
                iMonth = 8;
                break;
            case "September", "Sept.", "Sep", "9":
                iDays = 30;
                iMonth = 9;
                break;
            case "October", "Oct.", "Oct", "10":
                iDays = 31;
                iMonth = 10;
                break;
            case "November", "Nov.", "Nov", "11":
                iDays = 30;
                iMonth = 11;
                break;
            case "December", "Dec.", "Dec", "12":
                iDays = 31;
                iMonth = 12;
                break;
            default:
                isMonthValid = false;
        }
        return isMonthValid;
    }

    public int getiMonth() {
        return iMonth;
    }

    public int getiDays() {
        return iDays;
    }

    public void printDays() {
        System.out.println("Number of days: " + iDays);
    }
    
    String getMonthForInt(int m) {
        m = m - 1;
        String month = "invalid";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (m >= 0 && m <= 11) {
            month = months[m];
        }
        return month;
    }

    String getDayOfMonth(int day) {

        String strDay = Integer.toString(day);

        if (day >= 11 && day <= 13) {
            return strDay + "th";
        }
        switch (day % 10) {
            case 1:
                return strDay + "st";
            case 2:
                return strDay + "nd";
            case 3:
                return strDay + "rd";
            default:
                return strDay + "th";
        }
    }
}