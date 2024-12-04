package com.sparta.codekata.year2024.month12;

class DivisorSum {
	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			// 약수의 개수가 짝수면 더하고, 홀수면 뺍니다.
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		return answer;
	}

	public int solution2(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			answer += i * ((count % 2 == 0) ? 1 : -1);
		}
		return answer;
	}
}

