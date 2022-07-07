package study01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String getCurrentDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);		//()에 아무것도 넣지 않으면 기본형으로 자동!
		
		return sdf.format(new Date());
		
		
		// DateMain에 더 자세한 설명 있음! 
	}

}
