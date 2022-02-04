// p55 第1章プログラムの書き方,1.3_変数宣言の文,1.3.5_定数の利用
// 1-5 円周率に定数を利用する（エラー）

package section01;

public class Code05 {
	public static void main(String[] args) {
		// 円周率は内容がプログラムの動作中に書き換わる必要のない変数である。
		// final付きで宣言された変数は定数と呼ばれ、宣言と同時にに初期値が代入された後は、値を書き換えることができなくなる。
		// 定数として円周率を宣言
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		// コンパイルエラーとなり誤りに気づく
		// PI = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}
}
