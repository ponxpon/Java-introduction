// p129 第3章条件分岐と繰り返し,3.5_繰り返し構文のバリエーション,3.5.4_ループ変数
// 3-8_for文のループ変数iの内容を表示する

package section03;

public class Code08 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.print("現在" + (i + 1) + "週目→");
		}
	}
}
