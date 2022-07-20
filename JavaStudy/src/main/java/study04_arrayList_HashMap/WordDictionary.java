package study04_arrayList_HashMap;

import java.util.HashMap;

public class WordDictionary {
	private HashMap<String, String> dictionaryBook = new HashMap<>();			// new HashMap 까먹지 말기 ㅋㅋ큐ㅠㅠㅠㅠ
	
	public void addWord(String key, String value) {
		dictionaryBook.put(key, value);
	}

	public String find(String param) {
//		return dictionaryBook.get(param);			 노놉.
		
		for (String key : dictionaryBook.keySet()) {
			if(key.toLowerCase().equals(param.toLowerCase())) {
				return dictionaryBook.get(key);
			}
		}
		return param;
	}
}
