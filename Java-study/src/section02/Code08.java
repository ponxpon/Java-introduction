// p84 第2章式と演算子,2.5_型の変換,2.5.4_演算時の自動型変換
// 2-8_異なる型同士の算術演算

package section02;

// 異なる型で演算を行った場合、「意味的に大きな型」に統一されてから演算される。
public class Code08 {
	public static void main(String[] args) {
		// 2(int型)を2.0(double型)に変換
		double d = 8.5 / 2;
		// 5(int型)を5L(long型)に変換
		long l = 5 + 2L;
		System.out.println(d);
		System.out.println(l);
	}
}
