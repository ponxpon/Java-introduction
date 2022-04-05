// p177 第4章配列,4.9_練習問題
// 練習4-4_数あてクイズプログラムの作成

package section04;

public class Main03 {
	public static void main(String[] args) {
		// 配列の準備
		int[] numbers = {3, 4, 9};
		// メッセージの表示
		System.out.println("1桁の数字を入力してください");
		// キーボードからの数字を入力
		int input = new java.util.Scanner(System.in).nextInt();
		// 配列を回しながら判定
		for (int n : numbers) {
			if (n == input) {
				System.out.println("アタリ！");
			}
		}
	}
}
