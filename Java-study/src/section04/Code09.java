// p156 第4章配列,4.4_配列のデータをまとめて扱う,4.4.1_for文を使って配列を扱う
// 4-9_for文を使って配列を扱う

package section04;

public class Code09 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
			// ループするたびにiの値が0~4で変化する
			System.out.println(scores[i]);
		}
	}
}
