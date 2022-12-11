package Calendar;

import java.util.Calendar;

public class CalendarExample {

    public static void main(String[] args) {
        // 추상 클래스이므로 new로 생성 못함
        // 클래스를 구현한 인스턴스를 가져옴
        Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간으로 세팅
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // 주의 ! month는 0부터 시작 함
        int lastDayMonth = cal.getActualMaximum(Calendar.DATE);

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("lastDayMonth = " + lastDayMonth);

        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
    }
}
