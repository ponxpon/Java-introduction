// p151 第4章配列,4.2_配列の書き方,4.2.1_配列の作成
// 4-4_配列の長さを調べる

package section04;

public class Code04 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		// 配列変数名.length：配列の要素数の取得
		int num = scores.length;
		System.out.println("要素の数: " + num);
	}
}
