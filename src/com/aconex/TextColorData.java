package com.aconex;
public class TextColorData implements IColorData {
	
	private String strFileName;
	
	TextColorData(String strInput){
		strFileName = strInput;
	}
	
	@Override
	public String[] getData() {
		// Read input file and return array of lines
		return null;
	}
}
