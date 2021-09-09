package parser;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import pojo.Image;

public class ParsePixels {
	
	private List<String> colors;

	public ParsePixels(String location) {

		Image img = new Image(location);

		this.colors = new ArrayList<>();

		for (Color[] pixelColorV : img.colors()) {
			for (Color pixelColor : pixelColorV) {
				this.colors.add(pixelColor.toString());
			}
		}

	}

	public List<String> getColors() {
		return colors;
	}
	
	
	

}
