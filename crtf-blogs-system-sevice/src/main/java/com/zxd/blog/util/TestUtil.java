package com.zxd.blog.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestUtil {

	public static void main(String[] args) {
		String str = "abc123a1";
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(str);
		while (m.find()) {
		System.out.print(m.group()+" ");
		}
	}
}
