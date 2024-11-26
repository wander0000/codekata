package com.sparta.codekata.year2024.month11;

import java.util.Arrays;

public class DivisorArray {
	public int[] solution(int[] arr, int divisor) {
		//자바 배열의 크기는 고정 -> 동적으로 변화할 수 없으므로
		// int[] result = new int[]; //이렇게 선언하면 컴파일 오류

		// 1. 배열만 사용해서 풀이
		// int[] temp = new int[arr.length];
		// int count = 0;
		// for (int i = 0; i < arr.length; i++) {
		// 	if( arr[i] % divisor == 0 ){
		// 		temp[count++] = arr[i];
		// 	}
		// }
		// if (count == 0){
		// 	return new int[]{-1};
		// }
		// int[] result = Arrays.copyOf(temp, count);
		// Arrays.sort(result);
		// return result;

		//2. 스트림을 이용해 필터, 정렬 한번에
		int[] result = Arrays.stream(arr)
			.filter(num -> num % divisor == 0)
			.sorted()
			.toArray();

		return result.length == 0 ? new int[]{-1} : result;
	}
}
