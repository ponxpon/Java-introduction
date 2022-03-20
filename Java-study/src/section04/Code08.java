// p154 第4章配列,4.3_配列と例外,4.3.1_範囲外要素の利用による例外の発生
// 4-8_配列を用いた点数管理プログラム（エラー）

package section04;

public class Code08 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		// 合計の算出
		// 要素の添え字は[0]~[4]だが、[5]を使っているのでエラーが起きる。
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
		// 平均の算出
		int avg = sum / scores.length;
		// 合計と平均の表示
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
	}
}
