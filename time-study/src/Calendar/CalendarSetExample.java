package Calendar;

import java.util.Calendar;

public class CalendarSetExample {
    public static void main(String[] args) {
        // Calendar.getInstance() 는 현재 시간을 가져오므로 원하는 시간을 지정하려면 set으로 지정
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        // set으로 날짜 설정
        cal1.set(2022, 11, 25, 10, 20, 30);
        cal2.set(Calendar.YEAR, 2023);
        cal2.set(Calendar.MONTH, 11);
        cal2.set(Calendar.DATE, 30);
        cal2.set(Calendar.SECOND, 40);

        // 두 날짜의 차이 밀리세컨즈를 초로 바꾸기 1000으로 나눔
        long diffSeconds = Math.abs((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / 1000);
        System.out.println(diffSeconds); // 두 날짜간의 차이 (초)
        System.out.println(diffSeconds / (24 * 60 * 60)); // 두 날짜간의 차이 (일)
    }
}
