// p54 第1章プログラムの書き方,1.3_変数宣言の文,1.3.5_定数の利用
// 1-4 書き換えてはいけない変数の値を上書きしてしまう

package section01;

public class Code04 {
	public static void main(String[] args) {
		// 円周率を入れた変数
		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		// 誤り 代入すべき変数は「pie」
		pi = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
	}
}
