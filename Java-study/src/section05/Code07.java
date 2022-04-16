// p202 第5章メソッド,5.3_戻り値の利用,5.3.1_戻り値とは
// 5-7_戻り値の例

package section05;

public class Code07 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		// addメソッドの呼び出し（110に化ける）
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}
}
