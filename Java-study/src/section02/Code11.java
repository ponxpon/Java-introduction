// p88 第2章式と演算子,2.6_命令実行の文,2.6.2_画面に文字を表示する命令
// 2-11_改行なし画面出力も命令

package section02;

public class Code11 {
	public static void main(String[] args) {
		String name = "すがわら";
		// System.out.print：改行ぜずに画面に文字を表示する
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");
	}
}
