// p163 第4章配列,4.4_配列のデータをまとめて扱う,4.4.5_拡張for文
// 4-14_拡張for文

package section04;

public class Code14 {
	public static void main(String[] args)  {
		int[] scores = {20, 30, 40, 50, 80};
		// 拡張for文：ループ変数や配列の添え字を記述する必要がない
		for (int value : scores) {
			System.out.println(value);
		}
	}
}
