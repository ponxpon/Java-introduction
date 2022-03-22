// p158 第4章配列,4.4_配列のデータをまとめて扱う,4.4.3_ループによる集計
// 4-10_点数管理プログラム（for文の利用）

package section04;

public class Code10 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		// 集計結果を入れるための変数を初期化して準備
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			// 1科目ずつ変数sumに合算する
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}
