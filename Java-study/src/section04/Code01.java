// p144 第4章配列,4.1_配列のメリット,4.1.1_変数が持つ不便さ
// 4-1_点数管理プログラム

package section04;

public class Code01 {
	public static void main(String[] args) {
		// 算数は20点
		int sansu = 20;
		// 国語は30点
		int kokugo = 30;
		// 理科は40点
		int rika = 40;
		// 英語は50点
		int eigo = 50;
		// 社会は80点
		int syakai = 80;

		// 合計の算出
		int sum = sansu + kokugo + rika + eigo + syakai;

		// 平均の算出
		int avg = sum/5;

		// 合計点
		System.out.println("合計点：" + sum);
		// 平均点
		System.out.println("平均点：" + avg);
	}
}
