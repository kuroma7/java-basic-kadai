package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String, String> wordMap = new HashMap<String, String>();
	
	public Dictionary_Chapter21() {
		wordMap.put("apple", "りんご");
		wordMap.put("peach", "桃");
		wordMap.put("banana", "バナナ");
		wordMap.put("lemon", "レモン");
		wordMap.put("pear", "梨");
		wordMap.put("kiwi", "キウィ");
		wordMap.put("strawberry", "いちご");
		wordMap.put("grape", "ぶどう");
		wordMap.put("masucat", "マスカット");
		wordMap.put("cherry", "さくらんぼ");
	}
	
	public void search(String sword) {
		boolean result = false;
		String a = "";
		String b = "";
		
		for(String word : wordMap.keySet() ) {
			if(sword == word) {
				result = true;
				a = sword;
				b = wordMap.get(word);
				}
			}
			if(result) {
				System.out.println(a + "の意味は" + b);
			}else {
				System.out.println(sword + "は辞書に存在しません");
			}
		}
	}