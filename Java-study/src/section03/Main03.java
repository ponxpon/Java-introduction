// p136 第3章条件分岐と繰り返し,3.8_練習問題
// 練習3-5_switch文の作成

package section03;

public class Main03 {
	public static void main(String[] args) {
		System.out.println("[メニュー]1：検索 2：登録 3：削除 4：変更>");
		int selected = new java.util.Scanner(System.in).nextInt();

		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
	}
}