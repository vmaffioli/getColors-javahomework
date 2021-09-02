package parser;

import java.awt.Color;

import pojo.Image;

public class ParsePixels {

	public ParsePixels(String location) {
		
		Image img = new Image(location);
		
		for (Color[] string : img.colors()) {
			for (Color sring : string) {
				System.out.println(sring);
			}
		}

	}
	
	


}
