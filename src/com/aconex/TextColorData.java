package com.aconex;
import java.io.*;

import java.util.ArrayList;

public class TextColorData implements IColorData {
	
	private String strFileName;
	private ArrayList<String> listData;
	
	public TextColorData(String strInput){
		strFileName = strInput;
		listData = null;
	}
	
	// Read input file and return array of lines
	@Override
	public ArrayList<String> getData() throws IOException{
		
		if(listData == null) {
			
			listData = new ArrayList<String>();
			
			FileReader fIn = new FileReader(strFileName);
			BufferedReader bufIn = new BufferedReader(fIn);
			
			String strLn;
			while((strLn = bufIn.readLine()) != null){
				listData.add(strLn);
			}
			
			bufIn.close();
			fIn.close();
		}
		
		return listData;
	}
}
