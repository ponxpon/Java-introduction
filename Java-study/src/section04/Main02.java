// p176 第4章配列,4.9_練習問題
// 練習4-2_3つの条件を満たすプログラムの作成

package section04;

public class Main02 {
	public static void main(String[] args) {
		// 1.3つの口座番号「121902」「8302」「55100」が格納されているint型配列moneyListを宣言する。
		int[] moneyList = {121902, 8302, 55100};
		// 2.配列の要素を1つずつfor文で取り出して画面に表示する。
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		// 3.同じ配列の要素を拡張for文で1つずつ取り出して画面に表示する。
		for (int m : moneyList) {
			System.out.println(m);
		}
	}
}
