package study01;

public class Counter {
	static int count = 0;
	
	Counter(){
		count++;
		System.out.println(count);
	}
	
	public static int getcount() {
		return count;
	}
}