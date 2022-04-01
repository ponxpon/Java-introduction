// p174 第4章配列,4.7_多次元の配列,4.7.1_多次元配列とは？
// 4-19_親配列と子配列の要素数を表示

package section04;

public class Code19 {
	public static void main(String args) {
		// このような初期化が可能
		int[][] scores = {{40, 50, 60}, {80, 70, 60}};
		// 2が出力される
		System.out.println(scores.length);
		// 3が出力される
		System.out.println(scores[0].length);
	}
}
