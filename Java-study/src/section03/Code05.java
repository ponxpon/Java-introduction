// p121 第3章条件分岐と繰り返し,3.4_分岐構文のバリエーション,3.4.3_break文を書き忘れると？
// 3-5_break文を書き忘れると

package section03;

public class Code05 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		// 常に1
		int fortune = 1;

		// switch文の直後に書くのは、条件式ではなく変数名
		switch (fortune) {
		// caseの横には値を書き、その後ろには:(コロン)を記述する。
		case 1:
			System.out.println("大吉");
			// ここにbreak;を入れ忘れる
			// break;
		case 2:
			System.out.println("中吉");
			// case以降の処置の末尾には忘れずにbreak文を記述する。
			break;
		case 3:
			System.out.println("吉");
			break;
		// default:は、条件に合致しない時の処理が不要な場合は省略可能である。
		default:
			System.out.println("凶");
		}
	}
}
// 実行結果（break文を書き忘れた結果）
// あなたの運勢を占います
// 大吉
// 中吉

// switch文は、条件に一致するcaseラベルまで処理をジャンプさせる命令にすぎない。
// break文で明示的に「処理を中断してswitch文を抜ける」という指示がない限り、制御構造の1つである順序に従って次のcase文へ処理が進んでしまう。
