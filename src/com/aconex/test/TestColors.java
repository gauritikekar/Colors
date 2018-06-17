package com.aconex.test;

import org.junit.Assert;
import org.junit.Test;

import com.aconex.Colors;
import com.aconex.test.TestTextColorData;

public class TestColors {

	@Test
	public void testGetHexValue() {
		Colors objClr = new Colors();
		Boolean ret = objClr.initialize(new TestTextColorData());
		Assert.assertTrue(ret.booleanValue());
		
		Assert.assertEquals("ff0000", objClr.getHexValue("red"));
		Assert.assertEquals(null, objClr.getHexValue("pink"));
	}

}
