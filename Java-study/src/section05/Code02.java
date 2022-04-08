// p186 第5章メソッド,5.1_メソッドを利用するメリット,5.1.3_メソッドの呼び出し
// 5-2_メソッドの呼び出し

package section05;

public class Code02 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		// helloメソッドを呼び出す
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}
	// helloメソッドの本体
	public static void hello() {
		// helloメソッドが呼び出された時の処理
		System.out.println("湊さん、こんにちは");
	}
}
