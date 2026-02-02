package ratewio.yearinfo.util;

public class YearUtils {
    static final int LEAP_YEAR_DAYS = 366;
    static final int NORMAL_YEAR_DAYS = 365;
    public static boolean isYearLeap(int year){
        return      (year % 400 == 0)
                ||  (year % 100 != 0 && year % 4 == 0);
    }
    public static int getDaysInYear(int year){
        return isYearLeap(year) ? LEAP_YEAR_DAYS : NORMAL_YEAR_DAYS;
    }
}
