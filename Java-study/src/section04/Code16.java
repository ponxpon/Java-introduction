// p168 第4章配列,4.6_配列の後片付け,4.6.1_ガベージコレクション
// 4-16_ガベージコレクション

package section04;

public class Code16 {
	public static void main(String args) {
		boolean judge = true;
		if (judge == true) {
			// ifブロック内で配列を作成
			// newで確保された3つの要素は普通の変数ではないので、ブロックが終了しても寿命を迎えない。
			// 3つの要素は、メモリ内のゴミ（garbage）になるがjavaにはガベージコレクションという仕組みがあり、メモリ上のゴミを自動的に探し出して片付けてくれる。
			int[] array = {1, 2, 3};
		}
	}
}
