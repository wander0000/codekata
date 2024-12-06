package com.sparta.codekata.year2024.month12;

public class LackMoney {
	public long solution(int price, int money, int count) {
		long totalCost = 0;
		for (int i = 1; i <= count; i++) {
			totalCost += (long) price * i;
		}
		long shortfall = totalCost - money;

		return shortfall > 0 ? shortfall : 0;
	}

	public long solution2(long price, long money, long count) {
		return Math.max(price * (count * (count + 1) / 2) - money, 0);
	}
}
