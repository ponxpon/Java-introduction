// p119 第3章条件分岐と繰り返し,3.4_分岐構文のバリエーション,3.4.2_switch文による分岐
// 3-4_冗長でスッキリしないソースコード

package section03;

public class Code04 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		// 1~4の乱数発生
		int fortune = new java.util.Random().nextInt(4) + 1;
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}
	}
}
