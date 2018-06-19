/*
 * Class to process RGB data
 */
package com.aconex;

import java.io.*;

public class Colors {

	private IColorData m_objClrData;

	public Colors(IColorData objTextClr) {
		m_objClrData = objTextClr;
	}

	public String getHexValue(String strColorName) {
		String strHexValue = null;
		RGB ob = m_objClrData.getDataMap().get(strColorName);
		if (ob != null) {
			strHexValue = String.format("%02x%02x%02x", ob.getR(), ob.getG(), ob.getB());
		}
		return strHexValue;
	}

	public static void main(String[] args) {

		if (args.length > 0) {

			// Initialize the interface that reads data from a text file.
			IColorData objColorData = new TextColorData();
			try {
				objColorData.initialize(args[0]);
				System.out.println(
						"Loaded " + Integer.toString(objColorData.getDataMap().size()) + " colors from " + args[0]);

				// Create container for fetching color values.
				Colors objClr = new Colors(objColorData);

				BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in));

				// Read until user inputs no data/enter key.
				String strColor = null;
				while (true) {
					strColor = bufIn.readLine();

					if (strColor.isEmpty()) {
						System.out.println("Bye");
						break;
					}

					String strColorHex = objClr.getHexValue(strColor);
					if (strColorHex == null) {
						System.out.println("Color " + strColor + " not known.");
					} else {
						System.out.println("#" + strColorHex);
					}
				}
			} catch (IOException ex) {
				System.out.println(ex.toString());
			}

		} else {
			System.out.println("Argument missing: File Name");
		}
	}
}
