package com.sparta.codekata.year2024.month11;

import java.util.Collection;
import java.util.Collections;

/*
**  정수𝑛 을 입력받아서
** 	n의 자릿수를 내림차순으로 정렬하여 반환
*/
public class StoredLongArray {
	public long solution(long n) {
		// 숫자를 문자열로 변환
		String str = Long.toString(n);
		// 1. 문자열을 문자 배열로 변환
		// char[] chars = str.toCharArray();
		// 1.1 문자 배열을 오름차순(asc)으로 정렬
		// java.util.Arrays.sort(chars);
		// 1.2 다시 문자열을 조합
		// StringBuilder sorted = new StringBuilder(new String(chars));
		//1.3 내림차순으로 뒤집어서
		// sorted.reverse();
		//1.4  결과를 long으로 변환
		// return Long.parseLong(sorted.toString());

		// 2. 문자열을 문자배열로 변환
		String [] arr = str.split("");
		//2.1 문자배열 내림차순으로 정렬(기본자료열은 안됨)
		java.util.Arrays.sort(arr, Collections.reverseOrder());
		//2.2 배열을 문자열로 합침
		String sortedStr = String.join("", arr);
		return Long.parseLong(sortedStr);
	}

}
