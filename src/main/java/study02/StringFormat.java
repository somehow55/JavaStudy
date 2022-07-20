package study02;

public class StringFormat {
	static int i = 2364583;
	
	public static void main(String[] args) {
		System.out.println(String.format("%d_", i));
		System.out.println(String.format("%11d_", i));
		System.out.println(String.format("%-5d_", i));
		System.out.println(String.format("%-5d+", i));
		System.out.println(String.format("%05d_", i));			// 남는 자리에 0을 넣겠다는 의미로 '0'을 넣음
		
		System.out.printf("%5d\n", i);
		System.out.println("ㅎ헷콩");
		
		long countier;
//		countier = 435874965*435485546;			// -757068622
//		countier = 435874965*435485546L;			// 189817247120755890
//		countier = 435874965L*435485546;			// 189817247120755890
//		countier = 435874965L*435485546L;			// 189817247120755890
		
//		System.out.println(countier);
	}

}
