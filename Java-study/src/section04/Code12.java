// p160 第4章配列,4.4_配列のデータをまとめて扱う,4.4.4_添え字に対応した情報の利用
// 4-12_DNAの記号をランダムに表示する

package section04;

public class Code12 {
	public static void main(String[] args)  {
		int[] seq = new int[10];

		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}

		// 生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
			case 0:
				System.out.println("A ");
				break;
			case 1:
				System.out.println("T ");
				break;
			case 2:
				System.out.println("G ");
				break;
			case 3:
				System.out.println("C ");
				break;
			}
		}
	}
}
