// p204 第5章メソッド,5.3_戻り値の利用,5.3.4_return文の注意点
// 5-9_return分の後に処理は書けない（エラー）

package section05;

public class Code09 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
		// この文が実行されることはないのでコンパイルエラーになる。
		// int a = 10;
	}
}
