package com.textwrap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextWrapTest
{
	@Test
	void twoWords()
	{
		TextWrap tw = new TextWrap();
		String result = tw.wrapText("One Two", 5);
		assertEquals("One \nTwo", result);
	}

	@Test
	void threeWords()
	{
		TextWrap tw = new TextWrap();
		String result = tw.wrapText("One Two Three", 10);
		assertEquals("One Two \nThree", result);
	}
	
	@Test
	void wrapMultipleTimes()
	{
		TextWrap tw = new TextWrap();
		String result = tw.wrapText("One Two Three Fours Five", 10);
		assertEquals("One Two \nThree \nFours Five", result);
	}
}
