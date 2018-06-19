/*
 * Class implementing IColorData interface to read from a text file.
 */
package com.aconex;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class TextColorData implements IColorData {

	protected Map<String, RGB> m_mapData;

	public TextColorData() {
		m_mapData = new HashMap<String, RGB>();
	}

	// Initialize with data from file.
	@Override
	public void initialize(String strFileName) throws IOException {
		FileReader fIn = new FileReader(strFileName);
		BufferedReader bufIn = new BufferedReader(fIn);

		m_mapData.clear();

		String strLn;
		while ((strLn = bufIn.readLine()) != null) {
			String[] arrTokens = strLn.split(",");

			// Ignore if incorrect
			if (arrTokens.length > 3) {
				RGB ob = new RGB(Integer.parseInt(arrTokens[1]), Integer.parseInt(arrTokens[2]),
						Integer.parseInt(arrTokens[3]));
				m_mapData.put(arrTokens[0], ob);
			}
		}

		bufIn.close();
		fIn.close();
	}

	@Override
	public Map<String, RGB> getDataMap() {
		return m_mapData;
	}
}
