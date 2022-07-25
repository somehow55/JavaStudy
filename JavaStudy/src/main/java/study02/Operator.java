package study02;

public class Operator {
	
	/*
		이스케이프 문자 (Escape Sequence) : 문자열 안에 확장된 표현을 하는 문자
		
		\t : 탭
		\b : 백스페이스
		\n : 줄 바꿈 (new line)
		\r : 줄 바꿈 (carriage return)
		\f : 폼 피드 (form feed)
		' : 작은 따옴표 
		" : 큰 따옴표
		\ : 역슬래쉬
	 */
	
	
	/* 단항 연산자 */
	public static void main(String[] args) {
		int a = 3;
		
		System.out.println(-a);		//양, 음 부호가 바뀜		// -3 출력
		System.out.println(++a);	//a에 1을 추가 			// 4 출력
		System.out.println(--a);	//a에 1을 감소			// 3 출력		
		
	}

}
