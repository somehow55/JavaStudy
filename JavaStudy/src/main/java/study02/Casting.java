package study02;

public class Casting {
	
	
	// 형변환
	
	// 큰 범위를 작은 범위에 넣는 것은 형변환이 자동으로 되지 않아 오류가 뜬다.
	// 작은 범위를 큰 범위에 넣는 것은 자동으로 형변환이 되어 아무런 문제가 생기지 않는다.
	// 이렇게 자동으로 형변환이 되었을 때 억지로 다시 형변환을 하려면 typeCasting을 해주면 된다.
	
	public static void main(String[] args) {
		
		
		/*
			int x = 3;
			double y = x;
		 	위는 아무런 문제 없음
		 */
		
		
		/*
			double x = 3.141592;
			int y = x;
			이건 오류가 뜬다! (cannot convert from double to int)
		*/
		
		double x = 3.141592;
		int y = (int) x;
		
		//이렇게 typeCasting을 해주면 굿!
		System.out.println(y);
		
		
		// float의 리터럴 표현방법. double, long도 똑같이 뒤에 d, L을 붙여주면 된다.
		float g = 3.414f;
		float f;
		f = 3.214f;
	}

}
