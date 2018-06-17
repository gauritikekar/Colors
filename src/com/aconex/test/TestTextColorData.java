package com.aconex.test;
import java.io.IOException;
import java.util.ArrayList;

import com.aconex.IColorData;

public class TestTextColorData  implements IColorData{
	
	private ArrayList<String> arrayExpectedData;
	
	public TestTextColorData() {
		arrayExpectedData = new ArrayList<String>();
		arrayExpectedData.add("white,25,255,255");
		arrayExpectedData.add("black,0,0,0");
		arrayExpectedData.add("red,255,0,0");
		arrayExpectedData.add("yellow,255,255,0");
		arrayExpectedData.add("green,0,128,0");
		arrayExpectedData.add("blue,0,0,255");
		arrayExpectedData.add("navy,0,0,128");
		arrayExpectedData.add("purple,128,0,128");
	}

	@Override
	public ArrayList<String> getData() throws IOException{
		return arrayExpectedData;
	}
	
}
