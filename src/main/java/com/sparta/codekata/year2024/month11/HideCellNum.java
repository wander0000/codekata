package com.sparta.codekata.year2024.month11;

public class HideCellNum {
	public String solution(String phone_number) {
		// 전체 길이를 가져옴
		int length = phone_number.length();

		// 뒷 4자리는 그대로 두고, 나머지는 '*'로 대체
		String hiddenPart = "*".repeat(length - 4);
		String visiblePart = phone_number.substring(length - 4);

		// 합쳐서 반환
		return hiddenPart + visiblePart;
	}

	public String solution2(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
	}
}
