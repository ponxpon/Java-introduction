// p86 第2章式と演算子,2.6_命令実行の文,2.6.1_命令実行の文とは
// 2-10_命令実行の文（画面に表示する）

package section02;

public class Code10 {
	public static void main(String[] args) {
		// 1.変数宣言の文
		String name = "すがわら";
		String message;
		// 2.計算の文
		message = name + "さん、こんにちは";
		// 3.命令実行の文
		System.out.println(message);
	}
}
