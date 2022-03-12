// p137 第3章条件分岐と繰り返し,3.8_練習問題
// 練習3-6_数あてゲームプログラムの作成

package section03;

public class Main04 {
	public static void main(String[] args) {
		System.out.println("[数あてゲーム]");
		// 0から9までの整数の中からランダムな数を1つ生成
		int ans = new java.util.Random().nextInt(10);
		// for文で5回繰り返すループ
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			// 数字を入力し、変数numに代入
			int num = new java.util.Scanner(System.in).nextInt();
			// numとansが等しかったら、「アタリ!」を出力し、break文で処理を中断してif文を抜ける。
			if (ans == num) {
				System.out.println("アタリ!");
				break;
			// numとansが等しくなかったら、「違います」を出力
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}
