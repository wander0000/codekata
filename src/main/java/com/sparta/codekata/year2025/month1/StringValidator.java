package com.sparta.codekata.year2025.month1;

public class StringValidator {
	public static boolean validate(String s) {
		if (s.length() == 4 || s.length() == 6) {
			return s.matches("\\d+");
		}
		return false;
	}
}
