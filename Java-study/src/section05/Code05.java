// p195 第5章メソッド,5.2_引数の利用,5.2.3_複数の引数を渡す例
// 5-5_引数の例（渡す値が複数の場合）

package section05;

public class Code05 {
	public static void main(String[] args) {
		// 100と20を渡してaddメソッドを呼び出す
		add(100, 20);
		// 200と50を渡してaddメソッドを呼び出す
		add(200, 50);
	}
	// 複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
