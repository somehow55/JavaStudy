package study04_arrayList_HashMap;

public class DictionaryMain {
	public static void main(String[] args) {
		WordDictionary dict  = new WordDictionary();
		
		dict.addWord("Movie", "영화");
		dict.addWord("cat", "고양이");
		dict.addWord("Dog", "개");
		dict.addWord("book", "책");
		dict.addWord("soap", "비누");
		dict.addWord("Glasses", "안경");

        System.out.println(dict.find("Book"));
        System.out.println(dict.find("glasses"));
	}
}
