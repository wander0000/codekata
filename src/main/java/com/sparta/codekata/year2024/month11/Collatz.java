package com.sparta.codekata.year2024.month11;

public class Collatz {
	public int solution(int num) {
		long n = num; // long 자료형으로 변환 -> 그냥 int로 계산하면 큰 숫자가 입력되었을 때 int의 범위를 벗어나는 경우가 생김
		int count = 0;

		while (n != 1) {
			if (count >= 500) {
				return -1; // 500번 초과 시 -1 반환
			}
			if (n % 2 == 0) {
				n /= 2; // 짝수인 경우
			} else {
				n = n * 3 + 1; // 홀수인 경우
			}
			count++;
		}
		return count;
	}
}
