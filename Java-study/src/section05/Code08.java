// p203 第5章メソッド,5.3_戻り値の利用,5.3.3_戻り値をそのまま使う
// 5-8_戻り値をそのまま使う

package section05;

public class Code08 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(add(add(10, 20), add(30, 40)));
	}
}
