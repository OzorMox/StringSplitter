package com.textwrap;

public class TextWrap
{
	public String wrapText(String text, int lineLimit)
	{
		String[] words = text.split(" ");
		StringBuilder sb = new StringBuilder();
		int lineLimitCount = lineLimit;
		for (String word : words)
		{
			StringBuilder lineTest = new StringBuilder();
			lineTest.append(sb + word + " ");
			if (lineTest.length() > lineLimitCount)
			{
				sb.append("\n");
				sb.append(word);
				sb.append(" ");
				lineLimitCount += lineLimit;
			}
			else
			{
				sb.append(word);
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}
}