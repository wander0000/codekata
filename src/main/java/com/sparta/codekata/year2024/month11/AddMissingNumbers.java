package com.sparta.codekata.year2024.month11;

import java.util.Arrays;

public class AddMissingNumbers {
	public int solution(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= 0 && numbers[i] <= 9){
				sum += numbers[i];
			}
		}
		return 45- sum;
	}

	public int solution2(int[] numbers) {
		// 0부터 9까지의 합(45)에서 numbers 배열의 모든 원소 합을 뺀 값 반환
		return 45 - Arrays.stream(numbers).sum();
	}

	// numbers 배열에 0~9 이외의 정수가 포함될 가능성이 있다면, 이를 필터링하여 올바른 값만 처리
	public int solution3(int[] numbers) {
		// numbers 배열에서 0~9 사이의 값만 합산
		int validSum = Arrays.stream(numbers)
			.filter(num -> num >= 0 && num <= 9) // 0~9 사이의 숫자만 필터링
			.sum();

		// 0~9의 합(45)에서 유효한 숫자들의 합을 뺀 값을 반환
		return 45 - validSum;
	}
}
