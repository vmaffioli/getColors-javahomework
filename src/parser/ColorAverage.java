package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class ColorAverage {
	
	private Map<String, Integer> value = new HashMap<String, Integer>();;

	public ColorAverage(List<String> colors) {

		List<String> filteredColors = new ArrayList<>(new HashSet<>(colors));
		
		for (String fcolor : filteredColors) {
			int count = 0;
			for (int i = 0; i < colors.size(); i++) {
				String c = colors.get(i);
				if (c.equals(fcolor)) {
					count++;
				}
			}
			value.put(fcolor, count);
		}
	}

	public Stream<Entry<String, Integer>> getValue(){
		Stream<Map.Entry<String, Integer>> sorted = value.entrySet().stream().sorted(Map.Entry.comparingByValue());
		return sorted;
	}
}
