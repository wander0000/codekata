package com.sparta.codekata.year2024.month12;

public class ValidateString {

	public boolean solution(String s) {
		if(s.length() ==4 || s.length() == 6 ){
			return s.matches("^\\d+$");
		}
		return false;
	}

	public boolean solution2(String s) {
		if (s.matches("^[0-9]{4}$") || s.matches("^[0-9]{6}$")) {
			return true;
		}
		return false;
	}

	public boolean solution3(String s) {
		if(s.matches("^\\d{4}$") || s.matches("^\\d{6}$")){
			return true;
		}
		return false;
	}

}
