package service;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import pojo.ColorRGB;
import pojo.ImageObject;

/**
 * 
 * ColorRGBDAOImpl
 * 
 * @author vmaffioli
 *
 */
public class ColorRGBDAOImpl implements ColorRGBDAO{
	
	private List<String> colors = new ArrayList<>();
	private List<ColorRGB> colorObjList = new ArrayList<>();

	public ColorRGBDAOImpl(String imgLocation) {
		// arquivo temporario
		ImageObject img = new ImageObject(imgLocation);
		
		//  coleta cores da imagem
		for (Color[] pixelColorList : img.colors()) {
			for (Color pixelColor : pixelColorList) {
				this.colors.add(pixelColor.toString()
						.replace("java.awt.Color[r=", "")
						.replace(",g=", ",")
						.replace(",b=", ",")
						.replace("]",""));
			}
		}
		
		// Lista sem valores repetidos
		List<String> filteredColors = new ArrayList<>(new HashSet<>(colors));
		
		// Compara as listas com e sem valores repetidos e conta as ocorrencias
		for (String fcolor : filteredColors) {
			int count = 0;
			for (int i = 0; i < colors.size(); i++) {
				String c = colors.get(i);
				if (c.equals(fcolor)) {
					count++;
				}
			}
			
		// Ordena do maior numero de ocorrencias para o menor	
			if(colorObjList.size()==0) {
				colorObjList.add(new ColorRGB(fcolor,count));
			} else if(count>colorObjList.get(0).getCount()) {
				colorObjList.add(new ColorRGB(fcolor,count));
			} else {
				colorObjList.add(colorObjList.size(),new ColorRGB(fcolor,count));
			}
		}

	}

	@Override
	public List<String> top5(){
		List<String> result = new ArrayList<>();
		result.add(colorObjList.get(0).getRGB());
		result.add(colorObjList.get(1).getRGB());
		result.add(colorObjList.get(2).getRGB());
		result.add(colorObjList.get(3).getRGB());
		result.add(colorObjList.get(4).getRGB());
		
		return result;
	}


	@Override
	public List<ColorRGB> allPercentage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
