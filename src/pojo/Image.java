package pojo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

/**
 * 
 * Image object
 * 
 * @author vmaffioli
 *
 */
public class Image {
	
	private BufferedImage image;
	private int width;
	private int height;
	private Color[][] rgb;

	
	//build the object
	public Image(String path){
		try {
			image = ImageIO.read( new File(path) );
			width = image.getWidth();
			height= image.getHeight();
			rgb = new Color[width][height];
			
			for(int w=0;w<width;w++) {			
				for(int h=0;h<height;h++) {
					rgb[w][h] = new Color(image.getRGB( w, h ));
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	
	public BufferedImage buffered() { 
		return image;
	}
	
	public Color[][] colors(){ 
		return rgb;
	}
	
	

	


	
	
	
	/*
	 * 	to load an image, use this:
	 *  image = ImageIO.read( new File(path) );
	 */
	

}
