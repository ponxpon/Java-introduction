// p123 第3章条件分岐と繰り返し,3.4_分岐構文のバリエーション,3.4.3_break文を書き忘れると？
// 3-6_あえてbreak文を書かない

package section03;

public class Code06 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		// 1~4の乱数発生
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		// fortuneが1か2
		case 1:
		case 2:
			System.out.println("いいね！");
			break;
		// fortuneが3
		case 3:
			System.out.println("普通です");
			break;
		// fortuneが4か5
		case 4:
		case 5:
			System.out.println("うーん...");
		}
	}
}
