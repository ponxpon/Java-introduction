// p164 第4章配列,4.5_配列の舞台裏,4.5.1_配列を理解する
// 4-15_実行結果は？

package section04;

public class Code15 {
	public static void main(String[] args) {
		// arrayA[0]は1
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		// arrayB[0]に100を代入
		arrayB[0] = 100;
		// arrayA[0]を表示：100が出力される
		System.out.println(arrayA[0]);
	}
}
