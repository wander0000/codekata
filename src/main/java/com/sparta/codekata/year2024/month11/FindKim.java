package com.sparta.codekata.year2024.month11;

public class FindKim {
	public String solution(String[] seoul) {
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				return "김서방은 " + i + "에 있다";
			}
		}
		return "";
	}
}
