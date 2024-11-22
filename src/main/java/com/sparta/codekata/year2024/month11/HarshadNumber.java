package com.sparta.codekata.year2024.month11;

import java.util.Arrays;

public class HarshadNumber {
	public boolean isHarshadNumber(int n) {
		if (0 < n && n <= 10000) {
			String str = Integer.toString(n);
			String[] arr = str.split("");
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			}
			return n % sum == 0;
		}else {
			throw new IllegalArgumentException("Input must be between 1 and 10000.");
		}
	}


	public boolean isHarshadNumberFromgpt(int n) {
		// 유효성 검사
		if (n <= 0 || n > 10000) {
			throw new IllegalArgumentException("Input must be between 1 and 10000.");
		}

		// 자릿수 합 계산
		int sum = 0;
		int temp = n;
		while (temp > 0) {
			sum += temp % 10; // 마지막 자릿수 더하기
			temp /= 10;       // 다음 자릿수로 이동
		}

		// 하샤드 수 판별
		return n % sum == 0;
	}

	public boolean isHarshadNumberFromgpt2(int n) {
		int sum = Arrays.stream(String.valueOf(n).split(""))
			.mapToInt(Integer::parseInt)
			.sum();
		return n % sum == 0;
	}
}
