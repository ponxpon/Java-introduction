// p79 第2章式と演算子,2.5_型の変換,2.5.2_代入時の自動型変換
// 2-5_値より大きな型の変数に代入

package section02;

// 代入時の自動型変換
// 意味的に「小さな型」の値を「大きな型」の箱に代入する場合、代入される値が代入先の変数の型に自動的に変換されてから代入が行われる。
public class Code05 {
	public static void main(String[] args) {
		// flout型の変数にint型を代入
		float f = 3;
		// double型の変数にflout型を代入
		double d = f;
		System.out.println(f);
		System.out.println(d);
	}
}
