// p93 第2章式と演算子,2.6_命令実行の文,2.6.6_キーボードから1行の入力を受け取る命令
// 2-15_キーボードから入力を受け付ける命令

package section02;

public class Code15 {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");
		// キーボードから1行の入力を受け取る命令
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		// キーボードから1つの整数の入力を受け付ける
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + age + "歳の" + name + "さん");
	}
}
