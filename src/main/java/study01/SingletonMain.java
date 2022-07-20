package study01;

public class SingletonMain {
	public static void main(String[] args) {
		//		Singleton singleton = new Singleton();		//이렇게 하면 컴파일 오류! 안 보임 private라서

		//		Singleton singleton = Singleton.getInstance();		//이렇게 하면 Singleton 클래스의 객체를 '생성'은 할 수 있게 됨. 하지만 호출할 때 마다 새로운 객체라서 싱글톤패턴이 아님.
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);			// true 출력됨! 처음에는 one이 null이므로 객체 생성됨. 하지만 두번째 singleton2에서는 이미 객체가 있어서 그대로 return하므로 true가 나오는 것.
		
		
	}

}
