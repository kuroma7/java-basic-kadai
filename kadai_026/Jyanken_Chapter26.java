package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	String me;
	String you;

	
	
	public String getMyChoice() {
		//自分のじゃんけんの手を入力する
		HashMap<String, String> jyan =  new HashMap<String, String>();
		jyan.put("r", "グー");
		jyan.put("s", "チョキ");
		jyan.put("p", "パー");
		
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		if(jyan.get(input) == null) {
			return getMyChoice();
		}else {
			me = jyan.get(input);
			System.out.print("自分の手は"+ me + ",");
			return me;
		}
				
	}
		
		
	public String getRandom() {
		
		String[] aite = {"グー","チョキ","パー"};
		//対戦相手のじゃんけんの手を乱数で選ぶ
		you = aite[(int)Math.random() * 3];
		System.out.println("対戦相手の手は" + you);
		
		return you;
	}
	
	public void playGame() {
		//じゃんけんを行う
		if(me.equals(you)) {
			System.out.println("あいこです");
		}else if(me.equals("グー")) {
			switch(you) {
			case "パー" -> System.out.println("自分の負けです");
			case "チョキ" -> System.out.println("自分の勝ちです");
			}
		}else if(me.equals("チョキ")) {
			switch(you) {
			case "グー" -> System.out.println("自分の負けです");
			case "パー" -> System.out.println("自分の勝ちです");
			}
		}else{
			switch(you) {
			case "チョキ" -> System.out.println("自分の負けです");
			case "グー" -> System.out.println("自分の勝ちです");
			}
		}
	}

}
