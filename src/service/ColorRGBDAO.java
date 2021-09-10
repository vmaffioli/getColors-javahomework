package service;

import java.util.List;

import pojo.ColorRGB;

/**
 * 
 * ColorRGBDAO
 * 
 * @author vmaffioli
 *
 */
public interface ColorRGBDAO {

		public List<String> top5();
		public List<ColorRGB> allPercentage();
	
}
