/*
 * Unit test cases for Colors.java 
 */
package com.aconex.test;

import org.junit.Assert;
import org.junit.Test;

import com.aconex.Colors;
import com.aconex.TextColorData;
import com.aconex.RGB;

// Test data class
class MockTextColorData extends TextColorData {

	public MockTextColorData() {
		m_mapData.put("white", new RGB(25, 255, 255));
		m_mapData.put("black", new RGB(0, 0, 0));
		m_mapData.put("red", new RGB(255, 0, 0));
		m_mapData.put("yellow", new RGB(255, 255, 0));
		m_mapData.put("green", new RGB(0, 128, 0));
		m_mapData.put("blue", new RGB(0, 0, 255));
		m_mapData.put("navy", new RGB(0, 0, 128));
		m_mapData.put("purple", new RGB(128, 0, 128));
	}
}

public class TestColors {

	@Test
	public void testGetHexValue() {
		Colors objClr = new Colors(new MockTextColorData());
		Assert.assertEquals("ff0000", objClr.getHexValue("red"));
		Assert.assertEquals(null, objClr.getHexValue("pink"));
	}
}
