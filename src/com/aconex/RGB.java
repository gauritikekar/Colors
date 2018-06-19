/*
 * Class to hold RGB color values.
 */
package com.aconex;

public class RGB {

	private int m_r;
	private int m_g;
	private int m_b;

	public RGB(int r, int g, int b) {
		m_r = r;
		m_g = g;
		m_b = b;
	}

	int getR() {
		return m_r;
	}

	int getG() {
		return m_g;
	}

	int getB() {
		return m_b;
	}
}
