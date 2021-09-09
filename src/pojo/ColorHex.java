package pojo;

public class ColorHex {
	
	private String hex;
	private int count;
	private float percentage;
	
	public ColorHex(String hex, int count) {
		this.hex = hex;
		this.count = count;
	}
	
	public String getHex() {
		return hex;
	}
	public int getCount() {
		return count;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float f) {
		this.percentage = f;
	}


}
