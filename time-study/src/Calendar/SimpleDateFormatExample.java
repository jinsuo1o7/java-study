package Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    // parse 문자열을 날짜로 변환, format 날짜를 지정한 포멧으로 문자열로 반환
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); // 원하는 포멧 설정 년, 월, 일
        Date toDay = null;
        try {
            toDay = sf.parse("2022-09-12"); // parese 문자열을 날짜로 바꿈
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sf.format(toDay)); // 지정한 포멧으로 변환하여 문자열로 반환.
    }
}
