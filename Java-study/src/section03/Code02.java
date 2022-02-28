// p104 第3章条件分岐と繰り返し,3.1_プログラムの流れ,3.1.3_繰り返しを体験する
// 3-2_トイレの空きを待つ繰り返し処理

package section03;

// whileという命令を使えば繰り返し制御を行える。後ろの()内に繰り返しを続ける条件を書く。
// 繰り返しを続ける条件が成立している限り何度でも直後のブロックの中身だけが繰り返し実行される。（今回のコードの場合は無限に繰り返しが続く）
public class Code02 {
	public static void main(String[] args) {
		// ここでtrueかfalseを代入
		boolean doorClose = true;
		// ドアが閉まっている間は
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
	}
}
