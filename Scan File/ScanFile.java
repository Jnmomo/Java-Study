import java.util.Scanner;
import java.io.File;

public class ScanFile {
	public static void main(String[] args) throws Exception {

		File f = new File("textfile.txt");
		Scanner scan = new Scanner(f);
		int isCount = 0;

		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			// System.out.println(s);
			String[] arr = s.split(" ");

			for (int i = 0; i < arr.length; i++)
				if (arr[i].toLowerCase().contains("is"))
					isCount++;
		}

		System.out.println("Count is = " + isCount);
	}
}