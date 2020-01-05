

public class Main {

    public static void main(String[] args) {
        boolean LeapYear = IsLeapYear.isLeapYear(2000);
        System.out.println(LeapYear);

        int NumberOfDays = IsLeapYear.getDaysInMonth(0, 2020);
        System.out.println(NumberOfDays);

    }
}
