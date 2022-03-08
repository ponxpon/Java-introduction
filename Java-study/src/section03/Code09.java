// p131 第3章条件分岐と繰り返し,3.6_制御構文の応用,3.6.1_制御構造のネスト
// 3-9_for文のループを2重にして九九の表を出力する

package section03;

public class Code09 {
	public static void main(String[] args) {
		// iは1から9まで繰り返し
		for (int i = 1; i < 10; i++) {
			// jも1から9まで繰り返し
			for (int j = 1; j < 10; j++) {
				// 掛け算の結果を出力
				System.out.println(i * j);
				// 空白を出力
				System.out.println(" ");
			}
			// 改行を出力
			System.out.println("");
		}
	}
}
