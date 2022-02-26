// p95 第2章式と演算子,2.8_練習問題
// 練習2-1_「x+yは15」と表示されるように修正する

package section02;

public class Main02 {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		// String ans = "x+yは" + x + y;
		// xとyを丸かっこで囲み、計算の評価順位を引き上げる。
		String ans = "x+yは" + (x + y);
		System.out.println(ans);
	}
}
