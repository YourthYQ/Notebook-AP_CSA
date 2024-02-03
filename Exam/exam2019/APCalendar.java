package exam2019;

public class APCalendar {

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int number = 0;
        for (int i = year1; i <= year2 && isLeapYear(i) == true; i++)
            number++;
        return number;
    }

    private static int firstDayOfYear(int year) {
        if (year == 2019)
            return 2;
        else if (year == 2020)
            return 3;
        else if (year == 2021)
            return 5;
        else
            return 0;
    }

    private static int dayOfYear(int month, int day, int year) {
        int numberOfDay = 0;
        for (int i = 1; i < month; i++)
            numberOfDay += dayInMonth(i);
        numberOfDay += day;
        if (isLeapYear(year) == true)
            numberOfDay++;
        return numberOfDay;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int unsortedDay = firstDayOfYear(year) + dayOfYear(month,day,year) - 1;
        return unsortedDay % 7;
    }

    public static int dayInMonth(int month) {
        int day;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            day = 31;
        else if (month == 2)
            day = 28;
        else
            day = 30;
        return day;
    }

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(2012));
        System.out.println(isLeapYear(2013));

        System.out.println(dayOfWeek(5,31,2019));
        System.out.println(dayOfWeek(5,31,2020));
        System.out.println(dayOfWeek(5,31,2021));

    }

}
