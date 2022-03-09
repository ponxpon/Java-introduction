// p135 第3章条件分岐と繰り返し,3.8_練習問題
// 練習_3-3

package section03;

public class Main01 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "すきやき";
		System.out.println("こんにちは");

		if (isHungry == 0) {
			 System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}
}
