package study05;

public class PrimitiveDataType {
	
	/*
	 	int, long, double, float, boolean, char 등을 '원시 자료형 (Primitive Data Type)' 이라고 부른다.
	 	이런 원시 자료형은 new 키워드로 값을 생성할 수 없다.
	 	
	 	int, long, double, float, boolean, char 등의 원시 자료형은 다음처럼 각각에 대응하는 Wrapper클래스들이 존재한다.
	 	int => Integer
	 	long => Long
	 	double => Double
	 	float => Float
	 	boolean => Boolean
	 	char => Char
	*/
	
	boolean result = true;
	char capitalC = 'C';
	int i = 15321;	
	
	
	/*
		ArrayList, HashMap, HashSet 등은 데이터 저장시 원시 자료형 대신 그에 대응하는 Wrapper 클래스들을 사용함.
		값 대신 객체를 주고 받을 수 있어 코드를 객체중심적으로 작성하는데 유리하다.
		또한 멀티 스레딩 환경에서 동기화를 지원하기 위해서는 Wrapper 클래스가 반드시 필요하다.
	 */

	
	
	
	
	/*
		하지만, String은 리터럴로 표기가 가능하지만 primitive 자료형이 아니다.
		String은 리터럴 표현식을 사용할 수 있도록 자바에서 특별 대우 해주는 자료형!
	 */
	
	/* 문자열 내장 메소드 */
	//1. equals
	//두 개의 문자열이 동일한지를 비교해 결과값을 리턴
	static String a = "hello";
	static String b = "java";
	static String c = "hello";
	
	static String aa = "hello";
	static String bb = new String("hello");
	
	
	
	//2. indexOf
	//문자열에서 특정 문자가 시작되는 위치(index)를 리턴
	static String d = "Hello Java";
	
	
	//3. charAt
	//문자열에서 특정 위치의 문자를 리턴
	static String e = "Hellooo Jito";
	
	
	//4. contains
	//문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴
	static String dd = "Hi Hello Bonjour"; 
	
	
	//5. replaceAll
	// 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때
	
	//6. substring
	//문자열 중 특정 부분을 뽑아낼 경우에 사용
	
	static String ee = "Hello Minasan";
	
	
	
	
	
	public static void main(String[] args) {
		// 1. equals
		System.out.println(a.equals(b)); // false 출력
		System.out.println(a.equals(c)); // true 출력
		
		System.out.println(aa.equals(bb));  // true 출력
		System.out.println(aa == bb);  // false 출력 (*서로 다른 객체를 가리킨다. ==는 두 개의 자료형이 동일한 객체인지 물어보는 연산자)
		
		
		//2. indexOf
		System.out.println(d.indexOf("Java"));			//0 시작이므로 6 출력
		
		
		//3. charAt
		System.out.println(d.indexOf("Jito"));			//존재하지 않으므로 -1 출력
		System.out.println(e.indexOf("Jito"));			//0 시작이므로 8 출력
		
		
		//4. contains
		System.out.println(dd.contains("Bonjour"));	//문자열 포함이므로 true 출력
		
		
		//5. replaceAll
		System.out.println(dd.replaceAll("Bonjour", "안녕하세요"));			//replaceAll("바꿔질 대상", "바꿀 문자열");
	}
	
	
}
