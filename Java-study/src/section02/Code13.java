// p90 第2章式と演算子,2.6_命令実行の文,2.6.4_文字列を数値に変換する命令
// 2-13_String型をint型に変換する命令

package section02;

public class Code13 {
	public static void main(String[] args) {
		String age = "31";
		// int n = Integer.parseInt(1)：文字列を数値に変換する。1は文字列として解釈させたい文字列（"23"など）
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
	}
}
