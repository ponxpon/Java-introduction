// p169 第4章配列,4.6_配列の後片付け,4.6.2_null
// 4-17_nullの利用（エラー）

package section04;

public class Code17 {
	public static void main(String args) {
		int[] array = {1, 2, 3};
		// null：int[]型などの参照型変数に代入すると、その変数は何も参照しなくなる。
		// 配列変数arrayにnullを代入
		array = null;
		array[0] = 10;
	}
}
