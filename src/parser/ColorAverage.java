package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import pojo.ColorHex;

public class ColorAverage {
	
	private List<ColorHex> colorObjList = new ArrayList<>();

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
			
			if(colorObjList.size()==0) {
				colorObjList.add(new ColorHex(fcolor,count));
			} else if(count>colorObjList.get(0).getCount()) {
				colorObjList.add(new ColorHex(fcolor,count));
			} else {
				colorObjList.add(colorObjList.size(),new ColorHex(fcolor,count));
			}
			
		}
	}

	public List<String> getTop5(){
		List<String> result = new ArrayList<>();
		result.add(colorObjList.get(0).getHex());
		result.add(colorObjList.get(1).getHex());
		result.add(colorObjList.get(2).getHex());
		result.add(colorObjList.get(3).getHex());
		result.add(colorObjList.get(4).getHex());
		
		for (String string : result) {
			System.out.println(string);
		}

		return result;
	}
}