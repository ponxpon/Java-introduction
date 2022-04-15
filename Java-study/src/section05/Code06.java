// p198 第5章メソッド,5.2_引数の利用,5.2.5_変数のスコープとローカル変数
// 5-6_引数を使わずに値を渡せないのか？（エラー）

package section05;

public class Code06 {
	public static void main(String[] args) {
		// addメソッドで使用するつもり
		int x = 100;
		// addメソッドで使用するつもり
		int y = 100;
		// addメソッドを呼び出す
		add();
	}
	public static void add() {
		// ここで使用するつもり（エラー）
		// int ans = x + y;
		// System.out.println(x + "+" + y + "=" + ans);
	}
}
// エラー理由：ブロック内で宣言された変数のスコープ（有効範囲）はそのブロック内に限定されるのがルールである。
// そのため、mainメソッド内で宣言した変数xとyは、mainメソッドのブロックの中でしか使用できない。
