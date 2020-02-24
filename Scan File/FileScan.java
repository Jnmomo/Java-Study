import java.util.Scanner;
import java.io.File;

public class FileScan {
	public static void main(String[] args) throws Exception {

		File f = new File(args[0]);
		Scanner scan = new Scanner(f);

		int countLine = 0;
		int countWord = 0;

		while (scan.hasNextLine()) {
			countLine++;
			String s = scan.nextLine();
			String[] words = s.split(" ");

			countWord += words.length;
		}

		System.out.println("The number of lines in the file is " + countLine);
		System.out.println("The number of words in the file is " + countWord);
	}
}