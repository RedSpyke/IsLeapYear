public class IsLeapYear {

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if ((year >= 1) && (year <= 9999)) {
            if (((year % 4) == 0) && ((year % 100) != 0)) {
                leapYear = true;
                return leapYear;
            }
            if ((year % 400) == 0) {
                leapYear = true;
                return leapYear;
            }
        } else {
            return leapYear;
        }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        int days = 0;

        if ((month <= 0) || (month > 12)) {
            days = -1;
        } else if ((year < 1) || (year > 9999)) {
            days = -1;
        } else {
            boolean leapYear = isLeapYear(year);

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    // February
                    if (leapYear) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
            }
        }
        return days;
    }

}

