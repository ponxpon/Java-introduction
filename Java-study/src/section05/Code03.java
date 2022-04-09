// p186 第5章メソッド,5.1_メソッドを利用するメリット,5.1.4_mainメソッド以外からのメソッドの呼び出し
// 5-3_mainメソッド以外からメソッドを呼び出す

package section05;

public class Code03 {
	public static void methodA() {
		System.out.println("methodA");
		// methodBメソッドの呼び出し
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		// methodAメソッドの呼び出し
		methodA();
	}
}
