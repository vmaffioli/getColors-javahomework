package pojo;

import java.util.ArrayList;
import java.util.List;

import controller.ParamURL;

public class ColorPalette {
	
	private List<String> top5colors = new ArrayList<>();
	private String param;
	
	public ColorPalette(String param) {
		this.param = param;
	}
	
    public List<String> getTop5(){
    	if (param != null) {
			this.top5colors = new ParamURL().getUnvalued(param);
		} else {
			this.top5colors.add("white");
			this.top5colors.add("white");
			this.top5colors.add("white");
			this.top5colors.add("white");
			this.top5colors.add("white");
		}
    	return this.top5colors;
    }

}
