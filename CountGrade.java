
//Count the number of each grade's occurrence

import java.util.Map;
import java.util.HashMap;

class CountGrade {

	public static void main(String[] args) {

		String[] grades = { "A", "A", "B", "C", "F", "B", "C", "B", "C" };

		Map<String, Integer> cntMap = new HashMap<String, Integer>();

		for (int i = 0; i < grades.length; i++) {
			String key = grades[i];
			Integer iObj;
			if (cntMap.containsKey(key)) {
				iObj = cntMap.get(key);
				cntMap.put(key, new Integer(iObj.intValue() + 1));
			} else {
				cntMap.put(key, new Integer(1));
			}

		}

		for (Map.Entry<String, Integer> entry : cntMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println("key=" + key + "  value=" + value.intValue());
		}

	}

}