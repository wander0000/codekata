package com.sparta.codekata.year2024.month11;

public class SumBetweenTwoIntegers {
	public long solution(int a, int b) {
		int start = Math.max(a, b);
		int end = Math.min(a, b);
		long answer = 0;
		for (int i = start; i <= end; i++) {
			answer += i;
		}
		return answer;
	}
	public long solution2(int a, int b) {

		long answer = 0;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
		return answer;
	}
}
