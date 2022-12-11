package Calendar;

import java.util.Calendar;

public class CalendarAddExample {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.MONTH, 8);
        cal1.set(Calendar.DATE, 9);

        cal1.add(Calendar.MONTH, 38); // 38개월 후
        cal1.add(Calendar.DATE, -20); // 20일 전
        System.out.println("cal1 = " + toString(cal1));
    }

    public static String toString(Calendar cal) {
        return String.valueOf("year:" + cal.get(Calendar.YEAR) + " month:" + cal.get(Calendar.MONTH));
    }
}
