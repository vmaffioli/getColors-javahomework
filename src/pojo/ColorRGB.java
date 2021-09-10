package pojo;

import java.util.List;

/**
 * 
 * Color RGB 
 * 
 * @author vmaffioli
 *
 */
public class ColorRGB {
	
	private String rgb;
	private int count;
	private List<String> colors;
	//private float percentage;
	
	public ColorRGB(String hex, int count) {
		this.rgb = hex;
		this.count = count;
	}
	
	public String getRGB() {
		return rgb;
	}
	public int getCount() {
		return count;
	}
	public List<String> getColors() {
		return colors;
	}

//	public float getPercentage() {
//		return percentage;
//	}
//	public void setPercentage(float f) {
//		this.percentage = f;
//	}



}
