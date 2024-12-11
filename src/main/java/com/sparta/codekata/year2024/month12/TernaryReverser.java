package com.sparta.codekata.year2024.month12;


public class TernaryReverser {
	public int solution(int n) {
		StringBuilder  sb = new StringBuilder();
		while (n > 0) {
			sb.append(n % 3);
			n /= 3;
		}
		int answer = 0;
		int power = 1;
		for (int i=sb.length()-1; i>=0; i--) {
			answer += (sb.charAt(i)-'0') * power;
			power *= 3;
		}
		return answer;
	}

	public int solution2(int n) {
		StringBuilder  sb = new StringBuilder();
		while (n > 0) {
			sb.append(n % 3);
			n /= 3;
		}
		return Integer.parseInt(sb.toString(),3);
	}

	public int solution3(int n) {
		StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
		return Integer.parseInt(sb.reverse().toString(),3);
	}
}
