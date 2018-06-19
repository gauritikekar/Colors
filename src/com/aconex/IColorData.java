/*
 * Interface to provide color data 
 */
package com.aconex;

import java.io.IOException;
import java.util.Map;

public interface IColorData {

	abstract void initialize(String strFileName) throws IOException;

	abstract Map<String, RGB> getDataMap();
}
