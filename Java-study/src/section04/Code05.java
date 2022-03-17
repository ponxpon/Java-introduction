// p152 第4章配列,4.2_配列の書き方,4.2.2_配列の利用方法
// 4-5_配列の要素に値を代入

package section04;

public class Code05 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		// 2つ目の要素scores[1]に代入
		scores[1] = 30;
		// 2つ目の要素scores[1]の中身を表示
		System.out.println(scores[1]);
	}
}
