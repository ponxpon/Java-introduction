// p153 第4章配列,4.2_配列の書き方,4.2.3_配列の初期化
// 4-7_配列は自動的に初期化される

package section04;

public class Code07 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		// 0が出力される（エラーにならない）
		System.out.println(scores[0]);
	}
}
