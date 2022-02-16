// p81 第2章式と演算子,2.5_型の変換,2.5.3_強制的な型変換
// 2-7_強制的な型変換

package section02;

public class Code07 {
	public static void main(String[] args) {
		// キャスト演算子：3.2というdouble型リテラルの前に記述された「(int)」が強制的な型変換を指示する。
		// 命令：強制的に3.2をint型変換して代入せよ
		int age = (int)3.2;
		System.out.println(age);
	}
}
// 実行結果
// 3
