// p89 第2章式と演算子,2.6_命令実行の文,2.6.3_大きい方の数値を代入する命令
// 2-12_大きい方の数値を代入する命令

package section02;

public class Code12 {
	public static void main(String[] args) {
		int a = 5; int b = 3;
		// int m = Math.max(1.2)：二つの値を比較して大きい方の数値を代入する。1及び2は比較したい値や式
		int m = Math.max(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は" + m);
	}
}
