// p53 第1章プログラムの書き方,1.3_変数宣言の文,1.3.5_定数の利用
// 1-3_変数の再代入

package section01;

public class Code03 {
	public static void main(String[] args) {
		//  変数ageを20で初期化
		int age = 20;
		System.out.println("私の年齢は" + age);
		// 変数ageに再度代入している
		age = 31;
		System.out.println("いや、本当の年齢は" + age);
	}
}
