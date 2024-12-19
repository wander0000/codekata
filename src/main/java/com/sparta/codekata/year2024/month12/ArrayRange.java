package com.sparta.codekata.year2024.month12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRange {
	public int[] solution(int[] array, int[][] commands) {
		int answer[] = new int[commands.length];
		int idx = 0;
		for (int[] command : commands) {
			int i = command[0];
			int j = command[1];
			int k = command[2];
			int[] subArray = Arrays.stream(Arrays.copyOfRange(array, i - 1, j)).sorted().toArray();
			answer[idx++] = subArray[k - 1];
		}
		return answer;
	}

	public int[] solution2(int[] array, int[][] commands) {
		return Arrays.stream(commands)
			.mapToInt(command -> {
				int i = command[0], j = command[1], k = command[2];
				return Arrays.stream(array, i - 1, j) // i-1부터 j까지의 부분 배열 스트림 생성
					.sorted()              // 정렬
					.toArray()[k - 1];    // k번째 값 추출
			})
			.toArray(); // 최종 결과를 배열로 변환
	}
}
