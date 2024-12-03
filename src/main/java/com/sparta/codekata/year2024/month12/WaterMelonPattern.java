package com.sparta.codekata.year2024.month12;

public class WaterMelonPattern {
	public String solution(int n) {
		String answer = "";
		// String[] str = {"수","박"};
		for(int i=1; i<=n; i++) {
			if(i%2 == 1){
				answer += "수";
			}else{
				answer += "박";
			}
		}
		return answer;
	}
	public String solution2(int n) {
		String answer = "";
		for(int i=1; i<=n; i++) {
			answer += (i%2==1)?"수":"박";
		}
		return answer;
	}
}
