package study03;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListStudy {
	
	public static void main(String[] args) {
		ArrayList<Pokemon> arraylist = new ArrayList<>();
		
		arraylist.add(new Pokemon("이상해씨"));
		arraylist.add(new Pokemon("이상해풀"));
		arraylist.add(new Pokemon("이상해꽃"));
		
		System.out.println(arraylist.get(0));
		System.out.println(arraylist.get(1));
		System.out.println(arraylist.get(2));
		System.out.println("===============================");
		
		// HashMap은 (Key, Value) 와 같은 식으로 쓰인다.
		
		
		
		
		HashMap<String, Pokemon> pokedex = new HashMap<>();
		//HashMap <Key의 자료형, 원소의 자료형>
		
		pokedex.put("피카츄", new Pokemon("피카츄"));
		pokedex.put("피카츄", new Pokemon("피츄"));
		pokedex.put("라이츄", new Pokemon("라이츄"));
		pokedex.put("이상해씨", new Pokemon("이상해씨"));
		pokedex.put("이상해꽃", new Pokemon("이상해꽃"));
		
		pokedex.remove("이상해풀");
		Pokemon poke003 = pokedex.get("이상해꽃");				//찾고자 하는 value에 해당하는 key를 파라미터로 넘기면 찾을 수 있음.
		
		System.out.println(pokedex.get("피카츄"));			// "피츄"가 나올 것
		System.out.println("===============================");
		
		for(String key : pokedex.keySet()) {				//keySet은 모든 key를 담고 있는 Set을 리턴한다. Set은 List나 Map과 같이 원소를 담고 있는 자료형 중 하나. for each문으로 탐색 가능.
			System.out.println(pokedex.get(key));
//			System.out.println("index");
//			System.out.println(pokedex);
		}
	}

}
