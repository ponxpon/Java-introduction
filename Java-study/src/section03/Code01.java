// p80 第3章条件分岐と繰り返し,3.1_プログラムの流れ,3.1.2_分岐を体験する
// 3-1_天気による行動の変化をJavaで表す

package section03;

public class Code01 {
	public static void main(String[] args) {
		boolean tenki = true;
		// もし変数tenkiがtrueだったら
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		// そうでなければ
		} else {
			System.out.println("DVDを見ます");
		}
	}
}
