package com.sparta.codekata.year2024.month12;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 1.이중for문
		// for(int i=0; i<m; i++){
		// 	for(int j=0; j<n; j++){
		// 		System.out.print("*");
		// 	}System.out.println();
		// }

		// 2. StringBuider 사용
		StringBuilder sb = new StringBuilder();
		IntStream.range(0, n).forEach(i -> sb.append("*"));
		IntStream.range(0, n).forEach(i -> System.out.print(sb.toString()));

	}
}
