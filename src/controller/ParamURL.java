package controller;

import java.util.ArrayList;
import java.util.List;

public class ParamURL {
	

	public String getValue(List<String> params) {
		String result = "";
		for (String param : params) {
			result += param.replace(",", "a0") + "a1";
		}
		return result;
	}

	public List<String> getUnvalued(String params) {
		List<String> result = new ArrayList<>();
		String[] paramsList = params.split("a1");
		for (String param : paramsList) {
			result.add("rgb("+param.replace("a0", ",")+")");
		}
		return result;
	}



}
