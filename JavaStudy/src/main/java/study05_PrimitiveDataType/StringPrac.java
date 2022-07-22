package study05_PrimitiveDataType;

public class StringPrac {
	
	//1.
	String a1 = "Happy Java";
	String b1 = "a";
	String c1 = "123";
	
	//2.
	String a2 = new String("Happy Java");
	String b2 = new String("a");
	String c2 = new String("123");

	//하지만 보통 문자열을 표현할 때는 가급적 첫번째 방식(리터럴 표기)을 사용하는 것이 좋다. 첫 번째 처럼 사용하면 가독성에 이점이 있고 컴파일 시 최적화에 도움을 주기 때문이다.
	
	
	
	/* 리터럴 표기
	 * String a = "happy java" 와 String a = new String("happy java")는 같은 값을 갖게 되지만 완전히 동일하지는 않다.
	 * 첫번째 방식을 리터럴(literal) 표기라고 하는데 객체 생성없이 고정된 값을 그대로 대입하는 방법을 말한다.
	 * 위 예에서 리터럴 표기법은 "happy java" 라는 문자열을 intern pool 이라는 곳에 저장하고 다음에 다시 동일한 문자열이 선언될때는 cache 된 문자열을 리턴한다.
	 * 두번째 방식은 항상 새로운 String 객체를 만든다.
	 */
}
