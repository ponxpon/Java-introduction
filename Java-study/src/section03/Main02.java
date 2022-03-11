// p136 第3章条件分岐と繰り返し,3.8_練習問題
// 練習3-4_if文コード修正

package section03;

public class Main02 {
	public static void main(String[] args) {
		boolean tenki = true;
		if (tenki == false) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}
	}
}
