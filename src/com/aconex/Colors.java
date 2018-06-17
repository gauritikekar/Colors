package com.aconex;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;

public class Colors {

	private Map<String, String> mapColorHex;
	
	public Colors() {
		mapColorHex = new HashMap<String, String>();
	}
	
	public Boolean initialize(IColorData objTextClr) {
		Boolean ret = true;
		try
		{
			ArrayList<String> arrayData = objTextClr.getData();
		
			for(String it : arrayData) {
				String[] arrTokens = it.split(",");
				String strHexVal = "";
				
				if(arrTokens.length>0) {
					for(int cnt=1; cnt < arrTokens.length; cnt++){
					     strHexVal += String.format("%02x",Integer.parseInt(arrTokens[cnt]));
					}
					mapColorHex.put(arrTokens[0], strHexVal);
				}				
			}
		}
		catch(IOException ex) {
			ret = false;
			System.out.println(ex.toString());
		}

		return ret;
	}
	
	public String getHexValue(String strColorName){
		return mapColorHex.get(strColorName);
	}
	
	public static void main(String[] args) {
		
	}
}
