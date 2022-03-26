// p162 第4章配列,4.4_配列のデータをまとめて扱う,4.4.5_拡張for文
// 4-13_従来のfor文

package section04;

public class Code13 {
	public static void main(String[] args)  {
		int[] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}
}
