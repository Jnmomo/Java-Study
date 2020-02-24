/*             
    *                 
   ***                   
  *****
 *******
*********
            L   _   *
 *******    1   1   7 
  *****     2   2   5
   ***      3   3   3
    *       4   4   1
*/

public class Pic6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s <= 5 - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5 - 1; i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5 * 2 - 1 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
