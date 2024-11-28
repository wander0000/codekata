public class SumWithSigns {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0; i < absolutes.length; i++){
			if(signs[i]){
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		return answer;
	}

	public int solution2(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			// 삼항연산자로 조건 처리
			answer += signs[i] ? absolutes[i] : -absolutes[i];
		}
		return answer;
	}

}
