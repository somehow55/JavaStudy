package study01;

class Singleton {
	private static Singleton one;		//one이라는 static 변수 만들기
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
//		return new Singleton();			//같은 클래스 안이니까 생성자 호출 가능
		
		if(one==null) one = new Singleton();
		return one;
	}
}