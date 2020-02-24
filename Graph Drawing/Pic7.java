/*
A
AB
ABC
ABCD
ABCDE
*/

public class Pic7 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (char ch = 'A'; ch <= (char) ('A' + i - 1); ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
//or
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) ('A' + j - 1));
			}
			System.out.println();
		}

	}

}
