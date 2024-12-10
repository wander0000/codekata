package com.sparta.codekata.year2024.month12;

public class LCMGCDCalculator {
	public int[] solution(int n, int m) {
		// 최대공약수(GCD) 계산
		int gcd = gcd(n, m);

		// 최소공배수(LCM) 계산
		int lcm = (n * m) / gcd;

		// 결과 배열 반환
		return new int[] {gcd, lcm};
	}

	// 최대공약수를 구하는 유클리드 호제법
	private int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
