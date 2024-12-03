package com.sparta.codekata.year2024.month12;

import java.util.stream.IntStream;

public class InnerProduct {

	public int solution(int[] a, int[] b) {
		int answer = 0;
		for(int i = 0; i < a.length; i++){
			answer += a[i] * b[i];
		}
		return answer;
	}

	public int solution2(int[] a, int[] b) {
		return IntStream.range(0, a.length)//정슈 스트림 생성 0~a.length-1까지
			.map(i -> a[i] * b[i])//두 배열의 곱셈결과로 이루어진 스트림 생성
			.sum();//합계
	}
}
