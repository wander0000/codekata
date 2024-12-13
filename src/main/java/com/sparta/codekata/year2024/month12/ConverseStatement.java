package com.sparta.codekata.year2024.month12;

public class ConverseStatement {
	public String solution(String s) {
		String answer = "";
		int idx = 0;
		String[] strArr = s.split("");

		for(int i=0; i<strArr.length; i++) {
			if((" ").equals(strArr[i])) idx = 0;
			else {
				if(idx%2==0) {
					idx++;
					strArr[i] = strArr[i].toUpperCase();
				}else {
					idx++;
					strArr[i] = strArr[i].toLowerCase();
				}
			}
			answer += strArr[i];
		}
		return answer;
	}

	public String solution2(String s) {
		String answer = "";
		String[] words = s.split(" ");
		for ( String word : words){
			char[] a = word.toCharArray();
			for(int i=0; i<a.length; i++) {
				if(i%2==0) {
					answer += Character.toUpperCase(a[i]);
				}else{
					answer += Character.toLowerCase(a[i]);
				}
			}
			answer += " ";
		}
		answer.trim();// 이렇게 해도 끝에 공백은 안없어지네..
		return answer;
	}
}
