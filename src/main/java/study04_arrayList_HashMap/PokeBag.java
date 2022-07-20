package study04_arrayList_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
	
	private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();		//final을 통해 한 번만 초기화가 가능하도록 한다.
	
	public ArrayList<Pokemon> getPokemons(String name) {
		return pokemons.get(name);			//가져오는 타입이 ArrayList여도 리턴 가능하도록 ArrayList<Pokemon>으로 해놓는다
	}
	

    public void add(Pokemon pokemon) {
    	String name = pokemon.name;
    	
    	if(getPokemons(name) == null) {
    		pokemons.put(name, new ArrayList<Pokemon>());
    	}
    	
		getPokemons(name).add(pokemon);			//arrayList라서 add 메소드 사용
    }

    
    public Pokemon getStrongest(String name) {			//같은 종류의 포켓몬 중 제일 센 포켓몬 가져오기
    	ArrayList<Pokemon> pokemonExistingList = getPokemons(name);			//name 이름의 포켓몬 목록
    	Pokemon strongest = null;		//return할 강한 포켓몬 변수
    	
    	if(pokemonExistingList == null) {
    		return null;
    	}
    	
    	for (Pokemon pokemon : pokemonExistingList) {		// name에 해당하는 ArrayList를 가져온 후 탐색		//비교를 통해 strongest를 찾기
    		if(strongest == null || pokemon.cp > strongest.cp) {
    			strongest = pokemon;
    		}
    	}
    	return strongest;
    }
    

    public Pokemon getStrongest() {			//가진 모든 포켓몬 중 가장 센 포켓몬을 가져오기
    	Pokemon theStrongest = null;
    	
    	//HashMap 전체를 탐색하기 (keySet을 통해 얻은 key로 탐색)
    	for (String key : pokemons.keySet()) {
    		
    		//key에 해당하는 가장 센 포켓몬을 가져오기
    		Pokemon p = getStrongest(key);
    		
    		
    		//theStrongest를 가장 센 포켓몬으로 교체
    		if(theStrongest==null || p.cp > theStrongest.cp) {
    			theStrongest = p;
    		}
    	}
    	
    	return theStrongest;    	
    }
    
}
