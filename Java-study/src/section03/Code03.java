// p107 第3章条件分岐と繰り返し,3.2_ブロックの書き方,3.2.1_ブロックとは
// 3-3_波カッコを省略した記述

package section03;

public class Code03 {
	public static void main(String[] args) {
		boolean tenki = true; // ここでtrueかfalseを代入
		// 内容が2行なので波カッコは省略不可能
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		// 1行しかないので波カッコは省略可能
		} else
			System.out.println("DVDを見ます");
	}
}
// 実際の開発現場では、プログラミングのミスを防止するため、このようなブロックの波カッコを省略することは推奨されない。
