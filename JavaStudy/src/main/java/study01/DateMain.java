package study01;

public class DateMain {
	public static void main(String[] args) {
//		System.out.println(DateUtil.getCurrentDate());		//(기본형) 22.7.6 오후 3:38
		System.out.println(DateUtil.getCurrentDate("yyyyMMdd"));		//(지정) 20220706
		System.out.println(DateUtil.getCurrentDate("yyyy년 MM월 dd일"));		//(지정) 2022년 07월 06일
		System.out.println(DateUtil.getCurrentDate("yy-M-d HH:mm:ss"));		//(지정) 22-7-6 15:43:49
		System.out.println(DateUtil.getCurrentDate("yy-MM-dd H:m:s"));		//(지정) 22-07-06 15:44:28
		System.out.println(DateUtil.getCurrentDate("yy-MM-dd h:m:s"));		//(지정) 22-07-06 3:44:49
		
		
		// 참고 공식 문서 :: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	}
}
