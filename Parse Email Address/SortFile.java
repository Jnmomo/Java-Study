import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortFile {
	public static void main(String[] args) throws Exception {

		File f = new File("attendance.txt");
		Scanner scan = new Scanner(f);

		// ceate a TreeMap, use company as key and name as value:
		Map<String, TreeSet<String>> attendee = new TreeMap<String, TreeSet<String>>();

		while (scan.hasNextLine()) {
			Email e = new Email(scan.nextLine());
			String company = e.parseCompanyName();
			String name = e.parseEmailName();

			if (attendee.containsKey(company)) {
				TreeSet<String> NameSet = attendee.get(company);
				NameSet.add(name);

				attendee.put(company, NameSet);
			} else {
				TreeSet<String> myNameSet = new TreeSet<String>();
				myNameSet.add(name);

				attendee.put(company, myNameSet);
			}
		}

		// test print:
		for (Map.Entry<String, TreeSet<String>> entry : attendee.entrySet()) {
			String company = entry.getKey();
			TreeSet<String> name = entry.getValue();

			for (String str : name)
				System.out.println(company + "\t" + str);
		}

		System.out.println();

		System.out.println("------ Histogram ------");

		for (Map.Entry<String, TreeSet<String>> entry : attendee.entrySet()) {
			String company = entry.getKey();
			TreeSet<String> name = entry.getValue();

			System.out.print("\n" + company + "\t");
			for (int i = 0; i < name.size(); i++)
				System.out.print("*");
		}

		System.out.println();

		System.out.println("------ Bill Gates? ------");

		for (Map.Entry<String, TreeSet<String>> entry : attendee.entrySet()) {
			String company = entry.getKey();
			TreeSet<String> name = entry.getValue();
			String s = "bill.gates";

			if (name.contains(s))
				System.out.println("Bill Gates attended conference.");
		}

		// output to a text file:
		File file = new File("example.txt");
		BufferedWriter output = new BufferedWriter(new FileWriter(file));
		String text = "";

		for (Map.Entry<String, TreeSet<String>> entry : attendee.entrySet()) {
			String company = entry.getKey();
			TreeSet<String> name = entry.getValue();

			for (String str : name) {
				text = company + "\t" + str + "\r\n";
				output.write(text);
			}

		}

		output.close();

	}

}