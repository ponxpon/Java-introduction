// p173 第4章配列,4.7_多次元の配列,4.7.1_多次元配列とは？
// 4-18_2次元配列の利用

package section04;

public class Code18 {
	public static void main(String args) {
		// 2次元配列の宣言：要素の型[][] 配列変数名 = new 要素の型[行数][列数]
		// 2行3列の配列
		int[][] scores = new int[2][3];
		// 2次元配列の要素の利用：配列変数名[行の添え字][列の添え字]
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][1]);
	}
}
