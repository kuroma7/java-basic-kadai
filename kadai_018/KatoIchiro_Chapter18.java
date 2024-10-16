package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName() {
		//フィールドの値をセットする
		givenName = "一郎";
	}
	
	//抽象メソッドに実装
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
