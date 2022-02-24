// p92 第2章式と演算子,2.6_命令実行の文,2.6.5_乱数を生み出して代入する命令
// 2-14_ランダムな数を生成する命令

package section02;

public class Code14 {
	public static void main(String[] args) {
		// int r = new java.util.Random().nextInt(1)：乱数を発生させる。1は発生させる乱数の上限値
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
	}
}
