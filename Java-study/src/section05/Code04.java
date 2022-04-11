// p193 第5章メソッド,5.2_引数の利用,5.2.2_1つの引数を渡す例
// 5-4_引数の例（渡す値が1つの場合）

package section05;

public class Code04 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		// "湊"を渡してhelloメソッドを呼び出す
		hello("湊");
		// "朝香"を渡してhelloメソッドを呼び出す
		hello("朝香");
		// "菅原"を渡してhelloメソッドを呼び出す
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
